package com.many.manyTomany;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.many.manyTomany.entity.Actor;
import com.many.manyTomany.entity.ActorMapper;
import com.many.manyTomany.entity.Category;
import com.many.manyTomany.entity.FilmDetail;
import com.many.manyTomany.entity.FilmDetailMapper;
import com.many.manyTomany.entity.Language;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	getFilmDetail();
    	//printActor();
    	
    	
    }
    
    
    
    static void getFilmDetail() {
    	try (Reader r = Resources.getResourceAsReader("mybatis-config.xml");) {
    		 
            // 読み込んだ設定ファイルからSqlSessionFactoryを生成します
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
 
            // SQLセッションを取得します
            try (SqlSession session = factory.openSession()) {
 
                // ActorテーブルのMapperを取得します
                FilmDetailMapper map = session.getMapper(FilmDetailMapper.class);
 
                FilmDetail dtl = map.selectByPrimaryKey((short)100);
 
                // 結果を表示します
                System.out.println("dtl.getFilmId : " + dtl.getFilmId());
                System.out.println("dtl.getTitle : " + dtl.getTitle());
                System.out.println("dtl.getDescription : " + dtl.getDescription());
                System.out.println("dtl.getReleaseYear : " + dtl.getReleaseYear());
                System.out.println("dtl.getLanguageId : " + dtl.getLanguageId());
                System.out.println("dtl.getRentalDuration : " + dtl.getRentalDuration());
                System.out.println("dtl.getRentalRate : " + dtl.getRentalRate());
                System.out.println("dtl.getLength : " + dtl.getLength());
                System.out.println("dtl.getLanguageId : " + dtl.getLanguageId());
                System.out.println("dtl.getReplacementCost : " + dtl.getReplacementCost());
                System.out.println("dtl.getRating : " + dtl.getRating());
                System.out.println("dtl.getSpecialFeatures : " + dtl.getSpecialFeatures());
                System.out.println("dtl.getLastUpdate : " + dtl.getLastUpdate());
 
                System.out.println("--Language--");
                Language lang = dtl.getLanguage();
                System.out.println("  lang.getLanguageId : " + lang.getLanguageId());
                System.out.println("  lang.getName : " + lang.getName());
                System.out.println("  lang.getLastUpdate : " + lang.getLastUpdate());
 
                System.out.println("--ActorList--");
                for (Actor actor : dtl.getActorList()) {
                    System.out.println("  actor.getActorId : " + actor.getActorId());
                    System.out.println("  actor.getFirstName : " + actor.getFirstName());
                    System.out.println("  actor.getLastName : " + actor.getLastName());
                    System.out.println("  actor.getFilmId : " + actor.getLastUpdate());
                    System.out.println("------------");
 
                }
 
                System.out.println("--CategoryList--");
 
                for (Category cate : dtl.getCategoryList()) {
                    System.out.println("  cate.cate : " + cate.getCategoryId());
                    System.out.println("  cate.getName : " + cate.getName());
                    System.out.println("  cate.getLastUpdate : " + cate.getLastUpdate());
                    System.out.println("----------------");
 
                }
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    }
    static void  printActor() {
    	// resources直下のmybatis-config.xmlを読み込みます(1)
        try (Reader r = Resources.getResourceAsReader("mybatis-config.xml");) {

            // 読み込んだ設定ファイルからSqlSessionFactoryを生成します(2)
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);

            // SQLセッションを取得します(3)
            try (SqlSession session = factory.openSession()) {

                // ActorテーブルのMapperを取得します(4)
                ActorMapper map = session.getMapper(ActorMapper.class);
                // Actorテーブルの主キー（actor_id)が１であるレコードを検索します(5)
                Actor actor = map.selectByPrimaryKey((short) 2);

          // 取得した内容を確認します
                System.out.println("actor.getActorId    = " + actor.getActorId());
                System.out.println("actor.getFirstName  = " + actor.getFirstName());
                System.out.println("actor.getLastName   = " + actor.getLastName());
                System.out.println("actor.getLastUpdate = " + actor.getLastUpdate());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
}
