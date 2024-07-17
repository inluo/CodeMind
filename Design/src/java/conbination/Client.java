package conbination;

//组合模式
public class Client {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("菜单管理",2);
        menu1.add(new Menu("页面删除",3));
        menu1.add(new Menu("页面新增",3));
        menu1.add(new Menu("删除菜单",3));
        menu1.add(new Menu("新增菜单",3));

        MenuComponent menu2 = new Menu("权限管理",2);
        menu2.add(new Menu("添加角色",3));
        menu2.add(new Menu("添加岗位",3));
        menu2.add(new Menu("添加权限",3));

        MenuComponent menu = new Menu("系统管理",1);
        menu.add(menu1);
        menu.add(menu2);

        menu.print();
    }
}
