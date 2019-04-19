/**
 * js表格操作 wgp
 */
var currRow = "0";
var currCell = "0";
function getSum(obj, objName) {
	var sum = 0;
	for (var i = 1; i < obj.rows.length - 1; i++) {
		for (var j = 1; j < obj.rows[i].cells.length; j++) {
			sum += parseInt(obj.rows[i].cells[j].innerText);
		}
	}
	document.getElementsByName(objName)[0].value = sum;
}

function ascCell(obj) {
	if (currCell >= 1 && currRow >= 1) {
		var len = obj.rows[0].cells.length;
		for (var j = 0; j < len; j++) {
			var order = 0;
			for (var i = 1; i < len - 2; i++) {
				if (parseInt(obj.rows[currRow].cells[i].innerText) > parseInt(obj.rows[currRow].cells[i
						+ 1].innerText)) {
					for (var k = 0; k < obj.rows.length; k++) {
						var tmp = obj.rows[k].cells[i].innerHTML;
						obj.rows[k].cells[i].innerHTML = obj.rows[k].cells[i
								+ 1].innerHTML;
						obj.rows[k].cells[i + 1].innerHTML = tmp;
					}
					order++;
				}
			}
			len--;
			if (order == 0) {
				break;
			}
		}
	}
	clear();
}

function descCell(obj) {
	if (currCell >= 1 && currRow >= 1) {
		var len = obj.rows[0].cells.length;
		for (var j = 0; j < len; j++) {
			var order = 0;
			for (var i = 1; i < len - 2; i++) {
				if (parseInt(obj.rows[currRow].cells[i].innerText) < parseInt(obj.rows[currRow].cells[i
						+ 1].innerText)) {
					for (var k = 0; k < obj.rows.length; k++) {
						var tmp = obj.rows[k].cells[i].innerHTML;
						obj.rows[k].cells[i].innerHTML = obj.rows[k].cells[i
								+ 1].innerHTML;
						obj.rows[k].cells[i + 1].innerHTML = tmp;
					}
					order++;
				}
			}
			len--;
			if (order == 0) {
				break;
			}
		}
	}
	clear();
}

function ascRow(obj) {
	if (currCell >= 1) {
		var rows = obj.rows;
		var len = rows.length - 2;
		for (var j = 0; j <= rows.length - 2; j++) {
			var order = 0;
			for (var i = 1; i < len; i++) {
				if (parseInt(rows[i].cells[currCell].innerText) > parseInt(rows[i
						+ 1].cells[currCell].innerText)) {
					obj.moveRow(i, i + 1);
					order++;
				}
			}
			len--;
			if (order == 0) {
				break;
			}
		}
	}
	clear();
}

function descRow(obj) {
	if (currCell >= 1) {
		var rows = obj.rows;
		var len = rows.length - 2;
		for (var j = 0; j < rows.length - 2; j++) {
			var order = 0;
			for (var i = 1; i < len; i++) {
				if (parseInt(rows[i].cells[currCell].innerText) < parseInt(rows[i
						+ 1].cells[currCell].innerText)) {
					obj.moveRow(i, i + 1);
					order++;
				}
			}
			len--;
			if (order == 0) {
				break;
			}
		}
	}
	clear();
}

var cur_row = null;
var cur_cell = null;
function deleteRow(obj, currow) {
	cur_row = currow;
	if (obj.rows.length == 1)
		return;
	var the_row;
	the_row = (cur_row == null || cur_row == 0) ? -1 : cur_row;
	// alert(the_row);
	try {
		obj.deleteRow(the_row);
	} catch (e) {
		obj.deleteRow(-1);
	}
	cur_row = null;
	cur_cell = null;
	// 清除文本框的值
	$VD("tr_obj").value = "";
	return true;
}

function del_row(the_table) {
	if (the_table.rows.length == 1)
		return;
	var the_row;
	the_row = (cur_row == null || cur_row == 0) ? -1 : cur_row;
	the_table.deleteRow(the_row);
	cur_row = null;
	cur_cell = null;
}
function deleteCell(obj) {
	// if(currCell>=1&&currCell<obj.rows[0].cells.length-1){
	for (var i = 0; i < obj.rows.length; i++) {
		obj.rows[i].deleteCell(currCell);
		// }
	}
	clear();
	averCol(obj);
}

function averCol(obj) {
	var wh = obj.width;
	var cells = obj.rows[0].cells;
	for (var i = 0; i < cells.length; i++) {
		cells[i].width = Math.ceil(wh / cells.length);
	}
}
/**
 * 动态插入一行
 * 
 * @param {}
 *            obj
 * @param {}
 *            k
 * @param {}
 *            vl
 * @return {Boolean}
 */
function insertRow(obj, k, vl, n) {
	var rowsnumber = obj.rows.length;
	var cellsnumber = obj.rows[0].cells.length;
	var now_num = 0;
	// alert("row:"+rowsnumber+" cel:"+cellsnumber);
	if (rowsnumber <= 1) {
		rowsnumber = 1;
	} else {
		now_num = obj.rows[rowsnumber - 1].cells[0].innerText;
	}
	var count = parseInt(now_num) + 1;
	var row = obj.insertRow(rowsnumber);
	row.align = 'center';
	for (var i = 0; i < cellsnumber; i++) {
		row.id = k;
		cell = row.insertCell(i);
		// alert('keywordName_'+k);
		if (n == 1) {
			cell.innerHTML = '&nbsp;&nbsp;<textarea class="inptStyle" rows="8" cols="50" value="'
					+ vl
					+ '" name="keywordName_'
					+ k
					+ '" id="keywordName_'
					+ k
					+ '" onblur="checkVLs(this);" onkeyup="chek_qj(this);" onfocus="getTrObj(this);"  onkeydown="verifyLength(this);"/></textarea>';
		}
		if (n == 2) {
			cell.innerHTML = '&nbsp;&nbsp;<textarea class="inptStyle" rows="2" cols="37" value="'
					+ vl
					+ '" name="keywordName_'
					+ k
					+ '" id="keywordName_'
					+ k
					+ '" onkeyup="chek_qj(this);" onfocus="getTrObj(this);"/></textarea>';
			// + '" onblur="checkVLs(this);" onkeyup="chek_qj(this);"
			// onfocus="getTrObj(this);"
			// onkeydown="verifyLength(this);"/></textarea>';
		}
	}
	// /alert(cell.innerHTML);
	return true;
}

/**
 * 动态插入一行
 * 
 * @param {}
 *            obj
 * @param {}
 *            k
 * @param {}
 *            vl
 * @return {Boolean}
 */
function insertRows(obj, k) {
	var rowsnumber = obj.rows.length;
	var cellsnumber = obj.rows[0].cells.length;
	var now_num = 0;
	// alert("row:"+rowsnumber+" cel:"+cellsnumber);
	if (rowsnumber <= 1) {
		rowsnumber = 1;
	} else {
		now_num = obj.rows[rowsnumber - 1].cells[0].innerText;
	}
	var count = parseInt(now_num) + 1;
	var row = obj.insertRow(rowsnumber);
	row.align = 'center';
	var idstr="";
	for (var i = 0; i < cellsnumber; i++) {
		row.id = k;
		cell = row.insertCell(i);
		cell.align='center';
		if(i==0)idstr = "sku"+rowsnumber;
		if(i==1)idstr = "cb"+rowsnumber;
		if(i==2)idstr = "jg"+rowsnumber;
		if(i==3)idstr = "fc"+rowsnumber;
		if(i==4)idstr = "kffc"+rowsnumber;
		if(i==0){ 
		   className="textinput2";
		}else{
           className="textinput";
		}
		cell.innerHTML = '<input id="'+idstr+'" name="'+idstr+'" class="'+className+'" type="text" value="" />';
		//alert(cell.innerHTML);
	
	}

	return true;
}

/**
 * 动态插入一行
 * 
 * @param {}
 *            obj
 * @param {}
 *            k
 * @param {}
 *            vl
 * @return {Boolean}
 */
function insertRowsc(obj, k) {
	var rowsnumber = obj.rows.length;
	var cellsnumber = obj.rows[0].cells.length;
	var now_num = 0;
	// alert("row:"+rowsnumber+" cel:"+cellsnumber);
	if (rowsnumber <= 1) {
		rowsnumber = 1;
	} else {
		now_num = obj.rows[rowsnumber - 1].cells[0].innerText;
	}
	var count = parseInt(now_num) + 1;
	var row = obj.insertRow(rowsnumber);
	row.align = 'left';
	var idstr="";
	for (var i = 0; i < cellsnumber; i++) {
		row.id = k;
		cell = row.insertCell(i);
		cell.align='left';
		if(i==0)idstr = "sku"+rowsnumber;
		if(i==1)idstr = "cb"+rowsnumber;
		if(i==2)idstr = "jg"+rowsnumber;
		if(i==3)idstr = "fc"+rowsnumber;
		if(i==4)idstr = "kffc"+rowsnumber;
		if(i!=0){
		   cell.innerHTML = '<input id="'+idstr+'" onkeyup="checkVal(this);" name="'+idstr+'" style="width:200px" type="text" value="" />';
		}else{
		   cell.innerHTML = '<input id="'+idstr+'" name="'+idstr+'" type="text" style="width:200px" value="" />';
		}
		//alert(cell.innerHTML);
	
	}

	return true;
}

function getTrObj(obj) {
	var tr_obj = obj.parentNode.parentNode;
	var tr_id = tr_obj.id;
	// alert(tr_id);
	document.getElementById('tr_obj').value = tr_id;
	// obj.value = "";
}
function insertCell(obj) {
	// if(currCell && currCell!=obj.rows[0].cells.length-1){
	for (var i = 0; i < obj.rows.length; i++) {
		obj.rows[i].insertCell(currCell + 1);
		obj.rows[i].cells[currCell + 1].innerHTML = '<input class="intext" id="keywordName" type="text"size="20" max="50" allownull="false"  onkeydown="verifyLength(this);"/>';
	}
	clear();
	// averCol(obj);
	// chnBgcolor(obj,currRow,"ffffff");
	// }
}
function check(obj) {
	var k = parseInt(obj.innerText);
	if (isNaN(k)) {
		obj.childNodes[0].innerText = 0;
		return 0;
	} else {
		obj.childNodes[0].innerText = k;
		return k;
	}
}
function sum(obj) {
	var o = event.srcElement;
	var total = 0;
	var tindex = obj.rows.length - 1;
	if (o.parentElement.tagName == "TD" && o.parentElement.cellIndex >= 1
			&& o.parentElement.parentElement.rowIndex >= 1) {
		var index = o.parentElement.cellIndex;
		var pindex = o.parentElement.parentElement.rowIndex;
		for (var i = 1; i < tindex; i++) {
			var num = check(obj.rows[i].cells[index]);
			total = parseInt(total) + num;
		}
		var total1 = 0;
		for (i = 1; i < obj.rows[pindex].cells.length - 1; i++) {
			total1 += check(obj.rows[pindex].cells[i]);
		}
		obj.rows[pindex].cells(obj.rows[pindex].cells.length - 1).innerText = total1;
		obj.rows[tindex].cells[index].innerText = total;
		obj.rows[tindex].cells(obj.rows[0].cells.length - 1).innerText = addAll(obj);
	}
	setPos(obj);
}
function chnBgcolor(obj, index, color) {
	for (var i = 0; i < obj.rows.length; i++) {
		if (i == index) {
			obj.rows[i].bgColor = color;
		} else {
			obj.rows[i].bgColor = "ffffff";
		}
	}
}
function setPos(obj) {
	var o = event.srcElement;
	if (o.tagName == "DIV") {
		currRow = o.parentElement.parentElement.rowIndex;
		currCell = o.parentElement.cellIndex;
		chnBgcolor(obj, currRow, "dedede");
	} else if (o.tagName == "TD") {
		currRow = o.parentElement.rowIndex;
		currCell = o.cellIndex;
	} else {
		currRow = obj.rows.length - 1;
		currCeil = obj.rows[0].cells.length - 1;
	}
}
function clear() {
	currRow = 0;
	currCell = 0;
}
function addAll(obj) {
	var total = 0;
	for (var i = 1; i < obj.rows[0].cells.length - 1; i++) {
		total += parseInt(obj.rows[obj.rows.length - 1].cells[i].innerText);
	}
	return total;
}

// hide a rol by id;
function hideCol(obj, col_id) {
	var tb = document.getElementById(obj);
	var trow = tb.rows;
	for (var i = 0; i < trow.length; i++) {
		trow[i].cells[col_id].style.display == '';
	}
}
// show a rol by id;
function showCol(obj, col_id) {
	var tb = document.getElementById(obj);
	var trow = tb.rows;
	for (var i = 0; i < trow.length; i++) {
		trow[i].cells[col_id].style.display == 'block';
	}
}

// /////////////////////////////////////////////
// 功能：合并表格
// 参数：tb－－需要合并的表格ID
// 参数：colLength－－需要对前几列进行合并，比如，
// 想合并前两列，后面的数据列忽略合并，colLength应为2
// 缺省表示对全部列合并
// data: 2012.03.29
// /////////////////////////////////////////////
function uniteTable(tb, objCol) {
	// 检查表格是否规整
	if (!checkTable(tb))
		return;
	var i = 0;
	var j = 0;
	var rowCount = tb.rows.length; // 行数
	var colCount = tb.rows[0].cells.length; // 列数
	var obj1 = null;
	var obj2 = null;
	// 为每个单元格命名
	for (i = 0; i < rowCount; i++) {
		for (j = 0; j < colCount; j++) {
			tb.rows[i].cells[j].id = "tb__" + i.toString() + "_" + j.toString();
		}
	}
	// 逐列检查合并
	for (t = 0; t < objCol.length; t++) {
		i = objCol[t];
		obj1 = document.getElementById("tb__0_" + i.toString())
		for (j = 1; j < rowCount; j++) {
			obj2 = document.getElementById("tb__" + j.toString() + "_"
					+ i.toString());
			if (obj1.innerHTML == obj2.innerHTML)// 修改了原来的innerText
			{
				obj1.rowSpan++;
				obj2.parentNode.removeChild(obj2);
			} else {
				obj1 = document.getElementById("tb__" + j.toString() + "_"
						+ i.toString());
			}
		}
	}
}

// ///////////////////////////////////////
// 功能：检查表格是否规整
// 参数：tb－－需要检查的表格ID
// data: 2012.03.29
// ///////////////////////////////////////
function checkTable(tb) {
	if (tb.rows.length == 0)
		return false;
	if (tb.rows[0].cells.length == 0)
		return false;
	for (var i = 0; i < tb.rows.length; i++) {
		if (tb.rows[0].cells.length != tb.rows[i].cells.length)
			return false;
	}
	return true;
}
