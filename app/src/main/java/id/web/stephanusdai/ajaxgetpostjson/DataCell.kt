/*
 * AndroidAjaxGetPostJSON by Stephanus Dai
 * @fullname : Stephanus Bagus Saputra
 *             ( 戴 Dai 偉 Wie 峯 Funk )
 * @email    : wiefunk@stephanusdai.web.id
 * @contact  : http://t.me/wiefunkdai
 * @support  : http://opencollective.com/wiefunkdai
 * @weblink  : http://www.stephanusdai.web.id
 * Copyright (c) ID 2023 Stephanus Bagus Saputra. All rights reserved.
 * Terms of the following https://stephanusdai.web.id/p/license.html
 */

package id.web.stephanusdai.ajaxgetpostjson

data class AuthorModel(
    var authorName: String,
    var authorLink: String,
    var linkYoutube: String,
    var linkGithub: String
)

data class EmployeeModel (
    var employeeId: String,
    var employeeName: String,
    var employeeSalary: String,
    var employeeAge: String
)

data class ResultModel (
    var resultName: String,
    var resultEmail: String,
    var resultComment: String
)