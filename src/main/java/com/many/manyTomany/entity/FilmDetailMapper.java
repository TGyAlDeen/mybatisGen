package com.many.manyTomany.entity;

public interface FilmDetailMapper extends FilmMapper{

	FilmDetail selectByPrimaryKey(short filmId);
}
