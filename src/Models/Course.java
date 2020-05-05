package Models;

import java.util.List;


/**
* @generated
*/
public class Course {
    
    /**
    * @generated
    */
    private static Integer count;
    
    /**
    * @generated
    */
    private Integer id;
    
    /**
    * @generated
    */
    private Integer teacherId;
    
    /**
    * @generated
    */
    private String name;
    
    
    /**
    * @generated
    */
    private List<Listener> listeners;
    
    /**
    * @generated
    */
    private List<Task> task;
    
    /**
    * @generated
    */
    private User user;
    
    /**
    * @generated
    */
    public Integer getId() {
        return this.id;
    }
    
    /**
    * @generated
    */
    public Integer getTeacherId() {
        return this.teacherId;
    }
    
    /**
    * @generated
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * @generated
    */
    public List<Listener> getListeners() {
        return this.listeners;
    }
    
    /**
    * @generated
    */
    public List<Task> getTask() {
        return this.task;
    }
    
    
    /**
    * @generated
    */
    public User getUser() {
        return this.user;
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public Course() {
        //TODO
    }
    
}
