abstract class ActiveRecord {
    public ActiveRecord() {}
    
    public void save() {
        beforeSave();
        System.out.println("Saving changes");
        afterSave();
    }

    protected void beforeSave() {}
    protected void afterSave() {}
}