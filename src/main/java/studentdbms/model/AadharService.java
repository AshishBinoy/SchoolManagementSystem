package studentdbms.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import studentdbms.entity.Aadhar;
import studentdbms.repository.AadharRepository;

@Service
public class AadharService
{
    @Autowired
    private AadharRepository aadharRepository;

    @Transactional
    public Aadhar save(Aadhar aadhar) {
        return aadharRepository.save(aadhar);
    }
}