package com.example.demo;

import org.mapstruct.Mapper;

public class Demo {

    public static class RootModel {
        private NestedModel nested;
        public NestedModel getNested() {
            return nested;
        }
    }

    public static class NestedModel {
        private String data;
        public String getData() {
            return data;
        }
    }

    public static class RootDto {
        private NestedDto nested;
        public NestedDto getNested() {
            return nested;
        }
        public void setNested(NestedDto nested) {
            this.nested = nested;
        }
    }

    public static record NestedDto(String data)
    implements GenericInterface<String>
    {}

    public static interface GenericInterface<T> {}

    @Mapper
    public static interface ModelMapper {
        public RootDto modelToDto(RootModel model);
    }
}
