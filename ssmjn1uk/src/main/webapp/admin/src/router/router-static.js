import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import xueshengkechengxinxi from '@/views/modules/xueshengkechengxinxi/list'
    import jiaoshixinxi from '@/views/modules/jiaoshixinxi/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xueshengqingjiaxinxi from '@/views/modules/xueshengqingjiaxinxi/list'
    import fudaoyuanxinxi from '@/views/modules/fudaoyuanxinxi/list'
    import fudaoyuanqingjiaxinxi from '@/views/modules/fudaoyuanqingjiaxinxi/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import kaoshichengjixinxi from '@/views/modules/kaoshichengjixinxi/list'
    import jiaoshiqingjiaxinxi from '@/views/modules/jiaoshiqingjiaxinxi/list'
    import xueshengxinxi from '@/views/modules/xueshengxinxi/list'
    import banjixinxi from '@/views/modules/banjixinxi/list'
    import fudaoyuan from '@/views/modules/fudaoyuan/list'
    import laoshikechengxinxi from '@/views/modules/laoshikechengxinxi/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '校园公告',
        component: news
      }
      ,{
	path: '/xueshengkechengxinxi',
        name: '学生课程信息',
        component: xueshengkechengxinxi
      }
      ,{
	path: '/jiaoshixinxi',
        name: '教师信息',
        component: jiaoshixinxi
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/xueshengqingjiaxinxi',
        name: '学生请假信息',
        component: xueshengqingjiaxinxi
      }
      ,{
	path: '/fudaoyuanxinxi',
        name: '辅导员信息',
        component: fudaoyuanxinxi
      }
      ,{
	path: '/fudaoyuanqingjiaxinxi',
        name: '辅导员请假信息',
        component: fudaoyuanqingjiaxinxi
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/kaoshichengjixinxi',
        name: '考试成绩信息',
        component: kaoshichengjixinxi
      }
      ,{
	path: '/jiaoshiqingjiaxinxi',
        name: '教师请假信息',
        component: jiaoshiqingjiaxinxi
      }
      ,{
	path: '/xueshengxinxi',
        name: '学生信息',
        component: xueshengxinxi
      }
      ,{
	path: '/banjixinxi',
        name: '班级信息',
        component: banjixinxi
      }
      ,{
	path: '/fudaoyuan',
        name: '辅导员',
        component: fudaoyuan
      }
      ,{
	path: '/laoshikechengxinxi',
        name: '老师课程信息',
        component: laoshikechengxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
