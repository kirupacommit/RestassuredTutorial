package gComplexPojo;
import lombok.Getter;

import java.util.List;


    public class pojoForComplexJson {
        private Person person;
        @Getter
        private List<String> hobbies;
        private boolean isMarried;
        private List<Education> education;
        private List<Project> projects;

        // Getters and setters for all fields

        public void setPerson(Person person) {
           this.person = person;
       }

        public void setHobbies(List<String> hobbies) {
            this.hobbies = hobbies;
        }

        public boolean isMarried() {
            return isMarried;
        }

        public void setMarried(boolean married) {
            isMarried = married;
        }

        public List<Education> getEducation() {
            return education;
        }

        public void setEducation(List<Education> education) {
            this.education = education;
        }

        public List<Project> getProjects() {
            return projects;
        }

        public void setProjects(List<Project> projects) {
            this.projects = projects;
        }

        public static class Person {
            private String name;
            private int age;
            private Address address;
            private String email;

            // Getters and setters for Person fields

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public Address getAddress() {
                return address;
            }

            public void setAddress(Address address) {
                this.address = address;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        }

        public static class Address {
            private String street;
            private String city;
            private String state;
            private String zipcode;

            // Getters and setters for Address fields

            public String getStreet() {
                return street;
            }

            public void setStreet(String street) {
                this.street = street;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getZipcode() {
                return zipcode;
            }

            public void setZipcode(String zipcode) {
                this.zipcode = zipcode;
            }
        }

        public static class Education {
            private String degree;
            private String major;
            private String university;

            // Getters and setters for Education fields

            public String getDegree() {
                return degree;
            }

            public void setDegree(String degree) {
                this.degree = degree;
            }

            public String getMajor() {
                return major;
            }

            public void setMajor(String major) {
                this.major = major;
            }

            public String getUniversity() {
                return university;
            }

            public void setUniversity(String university) {
                this.university = university;
            }
        }

        public static class Project {
            private String name;
            private String description;
            private List<String> technologies;
            private List<TeamMember> teamMembers;

            // Getters and setters for Project fields

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public List<String> getTechnologies() {
                return technologies;
            }

            public void setTechnologies(List<String> technologies) {
                this.technologies = technologies;
            }

            public List<TeamMember> getTeamMembers() {
                return teamMembers;
            }

            public void setTeamMembers(List<TeamMember> teamMembers) {
                this.teamMembers = teamMembers;
            }
        }

        public static class TeamMember {
            private String name;
            private String role;

            // Getters and setters for TeamMember fields

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }
        }
    }

