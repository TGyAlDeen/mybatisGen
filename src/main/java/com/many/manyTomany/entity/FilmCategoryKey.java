package com.many.manyTomany.entity;

public class FilmCategoryKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_category.category_id
     *
     * @mbggenerated
     */
    private Byte categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_category.film_id
     *
     * @mbggenerated
     */
    private Short filmId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_category.category_id
     *
     * @return the value of film_category.category_id
     *
     * @mbggenerated
     */
    public Byte getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_category.category_id
     *
     * @param categoryId the value for film_category.category_id
     *
     * @mbggenerated
     */
    public void setCategoryId(Byte categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_category.film_id
     *
     * @return the value of film_category.film_id
     *
     * @mbggenerated
     */
    public Short getFilmId() {
        return filmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_category.film_id
     *
     * @param filmId the value for film_category.film_id
     *
     * @mbggenerated
     */
    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }
}