package com.josh.training.pagination.Pagination.controller;

public class Controller {
    @GetMapping("/pagination/{offSet}/{pageSize}")
    public List<Student> findAllPagination(@PathVariable("offSet") int offSet, @PathVariable("pageSize") int pageSize) {
        return studentDao.findAll(PageRequest.of(offSet, pageSize))
                .getContent();
    }

    @GetMapping("/sorting/{offSet}/{pageSize}/{prop}")
    public List<Student> findAllSorting(@PathVariable("offSet") int offSet, @PathVariable("pageSize") int pageSize,@PathVariable ("prop") String prop) {
        List<Student> courses
                = studentDao.findAll(PageRequest.of(offSet,pageSize,Sort.by(prop)))
                .getContent();
        return courses;
    }
}
