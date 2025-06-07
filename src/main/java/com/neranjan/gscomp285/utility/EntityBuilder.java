package com.neranjan.gscomp285.utility;

@SuppressWarnings("hiding")
public abstract class EntityBuilder <Request, Entity> {
	public final Entity buildCreateEntity(Request request, Entity entity) {
		entity = initCreateEntity(request, entity);
//		entity = initCreatedOrganization(entity);
//		entity = initStatusBy(entity);
//		entity = initStatusOrganization(entity);
//		entity = initUpdatedOrganization(entity);
		return initCreatedBy(entity);
	}

	public final Entity buildUpdateEntity(Request request, Entity entity) {
		entity = initUpdateEntity(request, entity);
//		entity = initStatusBy(entity);
//		entity = initStatusOrganization(entity);
//		entity = initUpdatedOrganization(entity);
		return initUpdatedBy(entity);
	}
	
	protected abstract Entity initUpdatedBy(Entity entity);

	protected abstract Entity initCreatedBy(Entity entity);
	
	protected abstract Entity initCreateEntity(Request request, Entity entity);
	
	protected abstract Entity initUpdateEntity(Request request, Entity entity);
	
}
