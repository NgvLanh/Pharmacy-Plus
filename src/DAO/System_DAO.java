/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;
/**
 *
 * @author Asus
 */
public abstract class System_DAO<E, K> {

    abstract public void insert(E entity);

    abstract public void update(E entity);

    abstract public void delete(K id);

    abstract public List<E> selectAll();

    abstract public E selectbyID(K id);

    abstract protected List<E> selectbySql(String sql, Object... args);
}
