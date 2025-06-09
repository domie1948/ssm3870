
var projectName = '课程管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '学生信息',
	url: './pages/xueshengxinxi/list.html'
}, 
{
	name: '老师课程信息',
	url: './pages/laoshikechengxinxi/list.html'
}, 
{
	name: '学生课程信息',
	url: './pages/xueshengkechengxinxi/list.html'
}, 
{
	name: '班级信息',
	url: './pages/banjixinxi/list.html'
}, 
{
	name: '教师信息',
	url: './pages/jiaoshixinxi/list.html'
}, 
{
	name: '辅导员信息',
	url: './pages/fudaoyuanxinxi/list.html'
}, 

{
	name: '校园公告',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmjn1uk/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"辅导员","menuJump":"列表","tableName":"fudaoyuan"}],"menu":"辅导员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生信息","menuJump":"列表","tableName":"xueshengxinxi"}],"menu":"学生信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"老师课程信息","menuJump":"列表","tableName":"laoshikechengxinxi"}],"menu":"老师课程信息管理"},{"child":[{"buttons":["查看","修改","删除","新增"],"menu":"学生课程信息","menuJump":"列表","tableName":"xueshengkechengxinxi"}],"menu":"学生课程信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"buttons":["查看","报表","导出","删除","修改"],"menu":"考试成绩信息","menuJump":"列表","tableName":"kaoshichengjixinxi"}],"menu":"考试成绩信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"学生请假信息","menuJump":"列表","tableName":"xueshengqingjiaxinxi"}],"menu":"学生请假信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"教师请假信息","menuJump":"列表","tableName":"jiaoshiqingjiaxinxi"}],"menu":"教师请假信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师信息","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教师信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"辅导员信息","menuJump":"列表","tableName":"fudaoyuanxinxi"}],"menu":"辅导员信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"辅导员请假信息","menuJump":"列表","tableName":"fudaoyuanqingjiaxinxi"}],"menu":"辅导员请假信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"校园公告","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学生信息列表","menuJump":"列表","tableName":"xueshengxinxi"}],"menu":"学生信息模块"},{"child":[{"buttons":["查看"],"menu":"老师课程信息列表","menuJump":"列表","tableName":"laoshikechengxinxi"}],"menu":"老师课程信息模块"},{"child":[{"buttons":["查看"],"menu":"学生课程信息列表","menuJump":"列表","tableName":"xueshengkechengxinxi"}],"menu":"学生课程信息模块"},{"child":[{"buttons":["查看"],"menu":"班级信息列表","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息模块"},{"child":[{"buttons":["查看"],"menu":"教师信息列表","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教师信息模块"},{"child":[{"buttons":["查看"],"menu":"辅导员信息列表","menuJump":"列表","tableName":"fudaoyuanxinxi"}],"menu":"辅导员信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","请假","新增"],"menu":"学生信息","menuJump":"列表","tableName":"xueshengxinxi"}],"menu":"学生信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"学生课程信息","menuJump":"列表","tableName":"xueshengkechengxinxi"}],"menu":"学生课程信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"考试成绩信息","menuJump":"列表","tableName":"kaoshichengjixinxi"}],"menu":"考试成绩信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"学生请假信息","menuJump":"列表","tableName":"xueshengqingjiaxinxi"}],"menu":"学生请假信息管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学生信息列表","menuJump":"列表","tableName":"xueshengxinxi"}],"menu":"学生信息模块"},{"child":[{"buttons":["查看"],"menu":"老师课程信息列表","menuJump":"列表","tableName":"laoshikechengxinxi"}],"menu":"老师课程信息模块"},{"child":[{"buttons":["查看"],"menu":"学生课程信息列表","menuJump":"列表","tableName":"xueshengkechengxinxi"}],"menu":"学生课程信息模块"},{"child":[{"buttons":["查看"],"menu":"班级信息列表","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息模块"},{"child":[{"buttons":["查看"],"menu":"教师信息列表","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教师信息模块"},{"child":[{"buttons":["查看"],"menu":"辅导员信息列表","menuJump":"列表","tableName":"fudaoyuanxinxi"}],"menu":"辅导员信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["查看","修改"],"menu":"学生信息","menuJump":"列表","tableName":"xueshengxinxi"}],"menu":"学生信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"老师课程信息","menuJump":"列表","tableName":"laoshikechengxinxi"}],"menu":"老师课程信息管理"},{"child":[{"buttons":["查看"],"menu":"学生课程信息","menuJump":"列表","tableName":"xueshengkechengxinxi"}],"menu":"学生课程信息管理"},{"child":[{"buttons":["查看"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","导出","报表"],"menu":"考试成绩信息","menuJump":"列表","tableName":"kaoshichengjixinxi"}],"menu":"考试成绩信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"学生请假信息","menuJump":"列表","tableName":"xueshengqingjiaxinxi"}],"menu":"学生请假信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"教师请假信息","menuJump":"列表","tableName":"jiaoshiqingjiaxinxi"}],"menu":"教师请假信息管理"},{"child":[{"buttons":["查看","请假","新增"],"menu":"教师信息","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教师信息管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学生信息列表","menuJump":"列表","tableName":"xueshengxinxi"}],"menu":"学生信息模块"},{"child":[{"buttons":["查看"],"menu":"老师课程信息列表","menuJump":"列表","tableName":"laoshikechengxinxi"}],"menu":"老师课程信息模块"},{"child":[{"buttons":["查看"],"menu":"学生课程信息列表","menuJump":"列表","tableName":"xueshengkechengxinxi"}],"menu":"学生课程信息模块"},{"child":[{"buttons":["查看"],"menu":"班级信息列表","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息模块"},{"child":[{"buttons":["查看"],"menu":"教师信息列表","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教师信息模块"},{"child":[{"buttons":["查看"],"menu":"辅导员信息列表","menuJump":"列表","tableName":"fudaoyuanxinxi"}],"menu":"辅导员信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"},{"backMenu":[{"child":[{"buttons":["查看","修改"],"menu":"学生信息","menuJump":"列表","tableName":"xueshengxinxi"}],"menu":"学生信息管理"},{"child":[{"buttons":["查看"],"menu":"老师课程信息","menuJump":"列表","tableName":"laoshikechengxinxi"}],"menu":"老师课程信息管理"},{"child":[{"buttons":["查看"],"menu":"学生课程信息","menuJump":"列表","tableName":"xueshengkechengxinxi"}],"menu":"学生课程信息管理"},{"child":[{"buttons":["查看","修改"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"buttons":["查看","导出","报表"],"menu":"考试成绩信息","menuJump":"列表","tableName":"kaoshichengjixinxi"}],"menu":"考试成绩信息管理"},{"child":[{"buttons":["查看","审核","修改","删除"],"menu":"学生请假信息","menuJump":"列表","tableName":"xueshengqingjiaxinxi"}],"menu":"学生请假信息管理"},{"child":[{"buttons":["查看","修改"],"menu":"教师信息","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教师信息管理"},{"child":[{"buttons":["新增","查看","请假"],"menu":"辅导员信息","menuJump":"列表","tableName":"fudaoyuanxinxi"}],"menu":"辅导员信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"辅导员请假信息","menuJump":"列表","tableName":"fudaoyuanqingjiaxinxi"}],"menu":"辅导员请假信息管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"学生信息列表","menuJump":"列表","tableName":"xueshengxinxi"}],"menu":"学生信息模块"},{"child":[{"buttons":["查看"],"menu":"老师课程信息列表","menuJump":"列表","tableName":"laoshikechengxinxi"}],"menu":"老师课程信息模块"},{"child":[{"buttons":["查看"],"menu":"学生课程信息列表","menuJump":"列表","tableName":"xueshengkechengxinxi"}],"menu":"学生课程信息模块"},{"child":[{"buttons":["查看"],"menu":"班级信息列表","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息模块"},{"child":[{"buttons":["查看"],"menu":"教师信息列表","menuJump":"列表","tableName":"jiaoshixinxi"}],"menu":"教师信息模块"},{"child":[{"buttons":["查看"],"menu":"辅导员信息列表","menuJump":"列表","tableName":"fudaoyuanxinxi"}],"menu":"辅导员信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"辅导员","tableName":"fudaoyuan"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
