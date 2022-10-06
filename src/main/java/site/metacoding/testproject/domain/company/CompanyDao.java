package site.metacoding.testproject.domain.company;

import java.util.List;

public interface CompanyDao {
    public void insert(Company user);

    public Company findById(Integer id);

    public List<Company> findAll();

    public void update(Company user);

    public void delete(Integer id);
}