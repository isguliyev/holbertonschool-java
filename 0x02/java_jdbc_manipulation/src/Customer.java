public class Customer {
    private Integer id;
    private String name;
    private Integer age;
    private String cpf;
    private String rg;

    public Customer() {}

    public Customer (
        Integer id,
        String name,
        Integer age,
        String cpf,
        String rg
    ) {
        setId(id);
        setName(name);
        setAge(age);
        setCpf(cpf);
        setRg(rg);
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}