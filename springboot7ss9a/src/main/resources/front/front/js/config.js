
var projectName = '高校图书馆座位预约系统';
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
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '座位信息',
	url: './pages/zuoweixinxi/list.html'
},

{
	name: '交流论坛',
	url: './pages/forum/list.html'
},
{
	name: '公告信息',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8081/";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["查看","修改","删除","信用分"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"座位信息","menuJump":"列表","tableName":"zuoweixinxi"}],"menu":"座位信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"座位预约","menuJump":"列表","tableName":"zuoweiyuyue"}],"menu":"座位预约管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"班级信息","menuJump":"列表","tableName":"banjixinxi"}],"menu":"班级信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"签到信息","menuJump":"列表","tableName":"qiandaoxinxi"}],"menu":"签到信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"离开信息","menuJump":"列表","tableName":"likaixinxi"}],"menu":"离开信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"座位暂离","menuJump":"列表","tableName":"zuoweizanli"}],"menu":"座位暂离管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"举报信息","menuJump":"列表","tableName":"jubaoxinxi"}],"menu":"举报信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"信用分","menuJump":"列表","tableName":"xinyongfen"}],"menu":"信用分管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"信用加分","menuJump":"列表","tableName":"xinyongjiafen"}],"menu":"信用加分管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"信用减分","menuJump":"列表","tableName":"xinyongjianfen"}],"menu":"信用减分管理"},{"child":[{"buttons":["查看","删除"],"menu":"交流论坛","tableName":"forum"}],"menu":"交流论坛"},{"child":[{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约","举报"],"menu":"座位信息列表","menuJump":"列表","tableName":"zuoweixinxi"}],"menu":"座位信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除","签到","暂离","离开"],"menu":"座位预约","menuJump":"列表","tableName":"zuoweiyuyue"}],"menu":"座位预约管理"},{"child":[{"buttons":["查看"],"menu":"签到信息","menuJump":"列表","tableName":"qiandaoxinxi"}],"menu":"签到信息管理"},{"child":[{"buttons":["查看"],"menu":"离开信息","menuJump":"列表","tableName":"likaixinxi"}],"menu":"离开信息管理"},{"child":[{"buttons":["查看"],"menu":"座位暂离","menuJump":"列表","tableName":"zuoweizanli"}],"menu":"座位暂离管理"},{"child":[{"buttons":["查看"],"menu":"举报信息","menuJump":"列表","tableName":"jubaoxinxi"}],"menu":"举报信息管理"},{"child":[{"buttons":["查看"],"menu":"信用分","menuJump":"列表","tableName":"xinyongfen"}],"menu":"信用分管理"},{"child":[{"buttons":["查看"],"menu":"信用加分","menuJump":"列表","tableName":"xinyongjiafen"}],"menu":"信用加分管理"},{"child":[{"buttons":["查看"],"menu":"信用减分","menuJump":"列表","tableName":"xinyongjianfen"}],"menu":"信用减分管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约","举报"],"menu":"座位信息列表","menuJump":"列表","tableName":"zuoweixinxi"}],"menu":"座位信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"否","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"座位信息","menuJump":"列表","tableName":"zuoweixinxi"}],"menu":"座位信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"座位预约","menuJump":"列表","tableName":"zuoweiyuyue"}],"menu":"座位预约管理"},{"child":[{"buttons":["查看","删除"],"menu":"签到信息","menuJump":"列表","tableName":"qiandaoxinxi"}],"menu":"签到信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"离开信息","menuJump":"列表","tableName":"likaixinxi"}],"menu":"离开信息管理"},{"child":[{"buttons":["查看","删除"],"menu":"座位暂离","menuJump":"列表","tableName":"zuoweizanli"}],"menu":"座位暂离管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"举报信息","menuJump":"列表","tableName":"jubaoxinxi"}],"menu":"举报信息管理"},{"child":[{"buttons":["查看","加分","减分"],"menu":"信用分","menuJump":"列表","tableName":"xinyongfen"}],"menu":"信用分管理"},{"child":[{"buttons":["查看"],"menu":"信用加分","menuJump":"列表","tableName":"xinyongjiafen"}],"menu":"信用加分管理"},{"child":[{"buttons":["查看"],"menu":"信用减分","menuJump":"列表","tableName":"xinyongjianfen"}],"menu":"信用减分管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约","举报"],"menu":"座位信息列表","menuJump":"列表","tableName":"zuoweixinxi"}],"menu":"座位信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"教师","tableName":"jiaoshi"}]


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
