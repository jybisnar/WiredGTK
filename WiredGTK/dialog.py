import gi,os
from wired_module import GetPath
gi.require_version('Gtk', '3.0')
from gi.repository import Gtk
__current_dir=""
def dlgFile(title,FileOpen=True,types=[],path='',parent=None,FolderSelect=False):
    global __current_dir  
    if FolderSelect:
        dlgType=Gtk.FileChooserAction.SELECT_FOLDER
        dialog = Gtk.FileChooserDialog(title, parent,dlgType,
                                                       (Gtk.STOCK_OK, Gtk.ResponseType.OK),None)
    else:
        if FileOpen==True:
            dlgType=Gtk.FileChooserAction.OPEN
            sel=Gtk.STOCK_OPEN
        else:
            dlgType=Gtk.FileChooserAction.SAVE
            sel=Gtk.STOCK_SAVE

        dialog = Gtk.FileChooserDialog(title, parent,dlgType,
                                                       (Gtk.STOCK_CANCEL, Gtk.ResponseType.CANCEL,sel, Gtk.ResponseType.OK))

    if FolderSelect==False:
        filter_py = Gtk.FileFilter()
        filter_py.set_name("Python files")
        for a in types:
            filter_py.add_pattern(a)
        dialog.add_filter(filter_py)   
    if __current_dir=="" or __current_dir.find('examples')!=-1 or  __current_dir.find('plugin')!=-1:#os.getcwd():
        __current_dir=os.path.expanduser('~')
    if path=='':
        dialog.set_current_folder(__current_dir)
    else:
        dialog.set_current_folder(path)
    response = dialog.run()
    ret=None
    ret=response
    if response == Gtk.ResponseType.OK:
        ret= dialog.get_filename()
        dialog.destroy()
        __current_dir=GetPath(ret)
        return ret
    dialog.destroy()
    
    return ret
def add_filters(dialog):
   
    filter_py = Gtk.FileFilter()
    filter_py.set_name("Python files")
    filter_py.add_pattern("*.py")    
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

