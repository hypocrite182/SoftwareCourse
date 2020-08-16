
function Rendering(){
document.getElementById("nav").innerHTML="\t\t\t<ul class=\'list\'>\n"+"\t\t\t<li class=\"active\"><a href=\"home.html\" >首页</a></li>\n"+
"\t\t\t<li class=\"active\"><a href=\"login.html\" >车辆登记管理</a></li>\n"+"\t\t\t<li class=\"active\"><a href=\"accessRecord.html\" >车辆进出记录管理</a></li>\n"+"\t\t\t<li class=\"active\"><a href=\"test.html\">临时停车场管理</a></li>\n"+
"\t\t\t<li class=\"active\" onclick=\"g(this.id)\"><a href=\"#\">车辆信息排查</a></li>\n"+"</ul>";
}