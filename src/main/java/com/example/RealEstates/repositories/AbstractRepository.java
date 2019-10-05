package com.example.RealEstates.repositories;

import com.example.RealEstates.models.AbstractModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractRepository<M extends AbstractModel> {

    final protected Map<Integer, M> data = new HashMap<>();

    public List<M> getAll() {
        List<M> list = new ArrayList<>();

        data.forEach((integer, model) -> {
            list.add(model); //list of models taken from Map
        });

        return list;
    }

    public M findbyId(int id) {
        checkIfModelExists(id); //error if not exists

        return data.get(id);
    }

    public M add(M addingModel) { //adds to DB and returns model

        if (data.containsKey(addingModel.getId())) {
            throw new IllegalArgumentException("ERROR: " +
                    "Object id: " + addingModel.getId() + " already exists in repository!");
        }

        data.put(addingModel.getId(), addingModel);
        return addingModel;
    }

    public void deleteById(int id) {
        checkIfModelExists(id);

        data.remove(id);
    }

    public M updateById(int id, M updatingModel) { //adds to DB and returns model
        checkIfModelExists(id);

        data.remove(id); //removes old
        updatingModel.setId(id); //changes new model id to old one
        // (I dont like this)
        //it means that lastId from astract model is counted and then changed, right?
        data.put(id, updatingModel); //put new model instead of old one (faked by id)

        return updatingModel;
    }

    private void checkIfModelExists(int id) {
        if (!data.containsKey(id)) {
            throw new IllegalArgumentException("ERROR: Object id: " + id + " does NOT exist in repository!");

        }
    }

}
