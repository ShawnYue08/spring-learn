package org.westos.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author lwj
 * @date 2020/10/2 20:10
 */
public class CollectionDemo {
    private String[] names;
    private List<Integer> scores;
    private Map<String,Student> students;
    private Set<String> ids;

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

    public Map<String, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }

    public Set<String> getIds() {
        return ids;
    }

    public void setIds(Set<String> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return "CollectionDemo{" +
                "names=" + Arrays.toString(names) +
                ", scores=" + scores +
                ", students=" + students +
                ", ids=" + ids +
                '}';
    }
}
