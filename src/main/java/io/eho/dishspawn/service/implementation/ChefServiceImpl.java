package io.eho.dishspawn.service.implementation;

import io.eho.dishspawn.model.Chef;
import io.eho.dishspawn.repository.ChefRepository;
import io.eho.dishspawn.security.SecurityChef;
import io.eho.dishspawn.service.ChefService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ChefServiceImpl implements ChefService, UserDetailsService {

    private final ChefRepository chefRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Chef> optionalChef =
                chefRepository.findChefByUserName(userName);

        return optionalChef.map(c -> new SecurityChef(c))
                .orElseThrow(() -> new UsernameNotFoundException("userName: " + userName + " not found."));
    }

    @Override
    public void saveChef(Chef chef) {
        chefRepository.save(chef);
    }

    @Override
    public List<Chef> findAllChefs() {
        return chefRepository.findAll();
    }

    @Override
    public Chef findChefById(Long id) {
        Optional<Chef> optionalChef = chefRepository.findById(id);

        Chef chef = null;
        if(optionalChef.isPresent()) {
            chef = optionalChef.get();
        } else {
            // chef not found
            throw new RuntimeException("chef with id " + id + "not found");
        }

        return chef;
    }

    @Override
    public List<Chef> findAllChefByUserNameContaining(String searchKey) {
        return chefRepository.findAllByUserNameContainingIgnoreCaseOrderByUserNameAsc(searchKey);
    }

    @Override
    public void updateChef(Chef chef) {
        chefRepository.save(chef);
    }

    @Override
    public void deleteChef(Chef chef) {
        chefRepository.delete(chef);
    }

    @Override
    public Optional<Chef> findChefByUserName(String inputUserName) {
        return chefRepository.findChefByUserName(inputUserName);
    }
}
