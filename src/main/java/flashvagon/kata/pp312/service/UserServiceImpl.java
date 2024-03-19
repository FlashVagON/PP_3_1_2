package flashvagon.kata.pp312.service;

import flashvagon.kata.pp312.model.User;
import flashvagon.kata.pp312.model.response.UserResponse;
import flashvagon.kata.pp312.repository.UserRepository;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private static UserRepository userRepository;

    @Override
    @Transactional
    public void addUser(User user) {
        //userRepository.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        //userRepository.updateUser(user);
    }

    @Override
    @Transactional(readOnly = true)
    public User showUser(int id) {
        //return userRepository.showUser(id);
        return null;
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        //userRepository.deleteUser(id);
    }
    @Override
    @Transactional(readOnly = true)
    public List<UserResponse> listUsers() {
        return userRepository.findAll()
                .stream()
                .map(this::buildUserResponse)
                .collect(Collectors.toList());
    }

    @NotNull
    private UserResponse buildUserResponse(@NotNull User user) {
        return new UserResponse()
                .setId(user.getId())
                .setName(user.getName())
                .setSurname(user.getSurname())
                .setAge(user.getAge());
    }
}
