package cinema.service.impl;

import cinema.dao.RoleDao;
import cinema.model.Role;
import cinema.security.RoleName;
import cinema.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(RoleName roleName) {
        return roleDao.getByName(roleName);
    }
}
