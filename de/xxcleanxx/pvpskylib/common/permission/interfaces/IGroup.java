<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.permission.interfaces;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IIdentifiable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.INameable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IPrefixAndSuffix;

import java.util.List;

public interface IGroup extends IPrefixAndSuffix, IPermissionHolder, IIdentifiable, INameable {
    List<IPermissionHolder> getMembers();

    void addMember(IPermissionHolder permissionHolder);

    void removeMember(IPermissionHolder permissionHolder);

    void addChildGroup(IGroup group);

    void removeChildGroup(IGroup group);
}
=======
package de.xxcleanxx.pvpskylib.common.permission.interfaces;

import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IIdentifiable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.INameable;
import de.xxcleanxx.pvpskylib.common.identifiable.interfaces.IPrefixAndSuffix;

import java.util.List;

public interface IGroup extends IPrefixAndSuffix, IPermissionHolder, IIdentifiable, INameable {
    List<IPermissionHolder> getMembers();

    void addMember(IPermissionHolder permissionHolder);

    void removeMember(IPermissionHolder permissionHolder);

    void addChildGroup(IGroup group);

    void removeChildGroup(IGroup group);
}
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
