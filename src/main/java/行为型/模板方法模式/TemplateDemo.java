package 行为型.模板方法模式;

public class TemplateDemo {

  /**
   * 改例子通过使用 JdbcTemplate，我们可以简化 JDBC 的使用，并避免一些常见的错误(ps: 没有引用包，注释防止报错，供参考)
   *
   * <p>jdbcTemplate定义了算法骨架，但是没有延迟到子类啊，这还算模版方法么？
   *
   * <p>在严格的设计模式定义中，模板方法模式通常涉及到一个抽象父类定义算法的骨架，然后具体的步骤实现被延迟到子类中。 然而，在实际的应用中，设计模式并不总是那么严格。
   * 对于JdbcTemplate，虽然它并没有直接将具体的步骤实现延迟到子类，但是它允许用户通过回调函数（比如RowMapper或PreparedStatementSetter等）来自定义某些步骤的行为。
   * 这种方式其实是一种变相的"延迟到子类"，因为用户可以通过创建不同的回调函数来改变或扩展JdbcTemplate的行为。
   *
   * <p>所以，尽管JdbcTemplate并没有完全符合模板方法模式的严格定义，但是它的设计思想和模板方法模式是相似的：定义了一个操作的骨架，并允许用户自定义某些步骤的行为。
   * 这也反映了在实际开发中，设计模式并不是规定死的规则，而是用来指导我们设计更好、更灵活代码的工具。我们可以根据实际需求来灵活使用和改变设计模式。
   */

  //  @Autowired
  //  private JdbcTemplate jdbcTemplate;
  //
  //  public List<Employee> findAllEmployees() {
  //    String sql = "SELECT * FROM employees";
  //
  //    return jdbcTemplate.query(sql, new RowMapper<Employee>() {
  //      @Override
  //      public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
  //        Employee employee = new Employee();
  //        employee.setId(rs.getInt("id"));
  //        employee.setName(rs.getString("name"));
  //        employee.setDepartment(rs.getString("department"));
  //        return employee;
  //      }
  //    });
  //  }
}
