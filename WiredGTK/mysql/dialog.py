import gi
gi.require_version('Gtk', '3.0')
from gi.repository import Gtk

def dlgFile(title):
    dialog = Gtk.FileChooserDialog(title, None,
        Gtk.FileChooserAction.OPEN,
        (Gtk.STOCK_CANCEL, Gtk.ResponseType.CANCEL,
         Gtk.STOCK_OPEN, Gtk.ResponseType.OK))

    add_filters(dialog)

    response = dialog.run()
    ret=None
    ret=response
    if response == Gtk.ResponseType.OK:
        ret= dialog.get_filename()
        dialog.destroy()
        return ret
    dialog.destroy()
    return ret
def add_filters(dialog):
   
    filter_py = Gtk.FileFilter()
    filter_py.set_name("Glade files")
    filter_py.add_pattern("*.dbbuilder")    
    dialog.add_filter(filter_py)

def dlgFolder(title):
    dialog = Gtk.FileChooserDialog(title, None,
        Gtk.FileChooserAction.SELECT_FOLDER,
        (Gtk.STOCK_CANCEL, Gtk.ResponseType.CANCEL,
         "Select", Gtk.ResponseType.OK))
    dialog.set_default_size(800, 400)

    response = dialog.run()
    if response == Gtk.ResponseType.OK:
        ret=dialog.get_filename()
        dialog.destroy()
        return  ret
    return response

    

class DialogExample(Gtk.Dialog):

    def __init__(self, parent,msg,title,buttons,msgOrInput,default):
        Gtk.Dialog.__init__(self, title, parent, 0,
            buttons)
        self.msgOrInput=msgOrInput
        self.set_default_size(150, 100)

        label = Gtk.Label(msg)

        box = self.get_content_area()
        box.add(label)
        if(msgOrInput==True):
            self.entry = Gtk.Entry()
            self.entry.set_text(default)
            box.add(self.entry)
            self.entry.show()        
        self.show_all()
    def run(self):
        result = super(DialogExample, self).run()
        text=result
        if result == Gtk.ResponseType.OK:
            if self.msgOrInput==True:
                text = self.entry.get_text()    
        return text
        
def msgbox(parent,msg,title,buttons=(Gtk.STOCK_OK, Gtk.ResponseType.OK),flag=False):
    dialog = DialogExample(parent,msg,title,buttons,msgOrInput=flag,default="")
    ret=dialog.run()
    dialog.destroy()
    return ret
def inputbox(parent,msg,title,buttons=(Gtk.STOCK_OK, Gtk.ResponseType.OK),flag=True,default="default"):
    dialog = DialogExample(parent,msg,title,buttons,msgOrInput=flag,default=default)
    ret=dialog.run()
    dialog.destroy()
    return ret


#print=msgbox(None,"My Message", "My Title")

#print=inputbox(None,"My Message", "My Title",default="Enter Number")

#print dlgFile("Select")
#print dlgFolder("Select")

