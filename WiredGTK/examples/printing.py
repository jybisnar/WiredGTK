#!/usr/bin/python
# -*- coding: utf8 -*-
from gi.repository import Gtk, Pango, PangoCairo#, cairo
import cairo

# a4 = 210 x 297
page_width = 210
page_height = 297
page_margin_top = 20
dpi = 600
_mm_dpi = 72 / 25.4

class PrintExample(Gtk.Window):

    def __init__(self):
        self.print_image()

    def print_image(self):
        """setup the paper size, print settings and kick of the print operation"""

        ps = Gtk.PaperSize.new_custom("cc", "cc", page_width, page_height, Gtk.Unit.MM)
        print_settings = Gtk.PrintSettings()
        print_settings.set_resolution(dpi)

        page_setup = Gtk.PageSetup()
        page_setup.set_paper_size(ps)
        page_setup.set_bottom_margin(10.0, Gtk.Unit.MM)
        page_setup.set_left_margin(5.0, Gtk.Unit.MM)
        page_setup.set_right_margin(4.5, Gtk.Unit.MM)
        page_setup.set_top_margin(10.0, Gtk.Unit.MM)
        page_setup.set_orientation(Gtk.PageOrientation.PORTRAIT)


        print_operation = Gtk.PrintOperation()
        print_operation.set_n_pages(1)
        print_operation.set_default_page_setup(page_setup)
        print_operation.set_print_settings(print_settings)
        print_operation.connect("draw_page", self.draw_page)
        print_operation.set_export_filename("example.pdf")

        result = print_operation.run(Gtk.PrintOperationAction.PREVIEW, None)
        print(result)


    def draw_page (self, operation, print_context, page_number):
        """draw with cairo to the print context layout for printing on sticky labels on an a4 sheet"""
        cr = print_context.get_cairo_context()
        cr.set_source_rgb(0, 0, 0)

        ims=cairo.ImageSurface.create_from_png("test.png")
        cr.set_line_width(1)

        desc = Pango.FontDescription("sans 5")

        layou_title_text = PangoCairo.create_layout(cr)
        layou_title_text.set_text("Title Text", -1)
        layou_title_text.set_font_description(desc)
        layou_title_text.set_width(100 * Pango.SCALE)
        layou_title_text.set_wrap(Pango.WrapMode.WORD)

        layou_desc_text = PangoCairo.create_layout(cr)
        layou_desc_text.set_text("Lorem ipsum .....", -1)
        layou_desc_text.set_font_description(desc)
        layou_desc_text.set_width(50 * Pango.SCALE)
        layou_desc_text.set_wrap(Pango.WrapMode.CHAR)

        #offset is the distance from the start of one box to the next including blank space
        rectangle_x_offset = 40.5 * _mm_dpi
        rectangle_y_offset = 21.5 * _mm_dpi

        #actual size of the box
        rectangle_width = 38 * _mm_dpi
        rectangle_height = 21.5 * _mm_dpi
        columns = int(page_width / 38)
        rows = int((page_height-page_margin_top) / 21)

        for column in range(0, columns):
            for row in range(0, rows):
                #qr code
                cr.set_line_width(0.1)
                cr.save()
                cr.translate(column * rectangle_x_offset, row * rectangle_y_offset + 15)
                cr.scale(0.15, 0.15)
                cr.set_source_surface(ims, 0, 0)
                cr.paint()
                cr.restore()

                #rectangle
                cr.rectangle(column * rectangle_x_offset , row * rectangle_y_offset, rectangle_width , rectangle_height )
                cr.stroke()

                #title text
                cr.save()
                cr.move_to(column * rectangle_x_offset + 4, row * rectangle_y_offset + 4)
                PangoCairo.update_layout(cr, layou_title_text)
                PangoCairo.show_layout (cr, layou_title_text)
                cr.restore()

                #description text
                cr.save()
                cr.move_to(column * rectangle_x_offset + 50, row * rectangle_y_offset + 14)
                PangoCairo.update_layout(cr, layou_desc_text)
                PangoCairo.show_layout (cr, layou_desc_text)
                cr.restore()

win = PrintExample()
Gtk.main()