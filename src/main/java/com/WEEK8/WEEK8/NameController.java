package com.WEEK8.WEEK8;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
@RestController
public class NameController {
    private final NameMapper nameMapper;
    public NameController(NameMapper nameMapper){
        this.nameMapper = nameMapper;
    }
    @GetMapping("/names")
    public List<Name> findAll(){
        return nameMapper.findAll();
    }

}
