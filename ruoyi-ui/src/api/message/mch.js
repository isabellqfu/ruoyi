import request from '@/utils/request'

// 查询商户列表
export function listMch(query) {
  return request({
    url: '/message/mch/list',
    method: 'get',
    params: query
  })
}

// 查询商户详细
export function getMch(id) {
  return request({
    url: '/message/mch/' + id,
    method: 'get'
  })
}

// 新增商户
export function addMch(data) {
  return request({
    url: '/message/mch',
    method: 'post',
    data: data
  })
}

// 修改商户
export function updateMch(data) {
  return request({
    url: '/message/mch',
    method: 'put',
    data: data
  })
}

// 删除商户
export function delMch(id) {
  return request({
    url: '/message/mch/' + id,
    method: 'delete'
  })
}
