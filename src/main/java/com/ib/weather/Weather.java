/**
 * DESCRIPTION: Contains all the information about the weather parameter codes.
 *
 * @param main is the group of weather parameters (Rain, Snow, Extreme etc.)
 * @param Id is the id of the current weather parameters.
 * @param description is the description of the current weather parameters.
 * @param icon is the icon of the current weather parameters.
 * @author Roman Mukosieiev
 * @version 1.0
 * @since 09/27/2020
 *
 */
package com.ib.weather;

public class Weather {

    private int id;
    private String main;
    private String description;
    private String icon;
//----------------------------------Utility----------------------------------

    @Override
    public String toString() {
        return "Arr [id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + "]";
    }

//----------------------------------Getters----------------------------------
    public int getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }
//----------------------------------Setters----------------------------------

    public void setId(int id) {
        this.id = id;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

}
