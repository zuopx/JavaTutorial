/**
 * Student DAO
 */

package percy.spring.jdbc;

import java.util.List;

import javax.sql.DataSource;

/**
 * StudentDAO
 * Interface and implementation are seperate.
 */
public interface StudentDAO {

  public void setDataSource(DataSource ds);

  public void create(String name, Integer age);

  public Student getStudent(Integer id);

  public List<Student> listStudent();

  public void delete(Integer id);

  public void update(Integer id, Integer age);
}