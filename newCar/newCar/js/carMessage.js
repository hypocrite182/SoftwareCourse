/*
通过这个js你可以对车辆登记信息进行操作
传入的值为当前行的下标index
*/
	
function carMessage_Delete(index){
	//获取表格信息
	var table=document.getElementById("idData");
	//获取单元格数据
	var parkNum=table.rows[index].cells[2].innerHTML;
	var parkingcardNum=table.rows[index].cells[4].innerHTML;
	document.getElementById("dparkNum").value=parkNum;
	document.getElementById("dparkingcardNum").value=parkingcardNum;
	
}