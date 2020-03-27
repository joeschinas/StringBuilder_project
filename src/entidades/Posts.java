
package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Posts {
    private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private Integer like;
    private  List<Comment> comentarios = new ArrayList<>();

    public Posts() {
    }
    
    public Posts(Date moment, String title, String content, Integer like) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.like = like;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }

    public List<Comment> getComentario() {
        return comentarios;
    }
    public void addComment(Comment comentario){
    
       comentarios.add(comentario);
    }
    public void removeComment(Comment comentario){
    comentarios.remove(comentario);
    }
    public StringBuilder ToString(){
    StringBuilder sb = new StringBuilder();
    sb.append(sdf.format(moment));
    sb.append(title);
    sb.append(content);
    sb.append(like);
    for(Comment cmt : comentarios){
        
      sb.append(cmt.getText());
    
    }
    return sb;
    
    
    
    }
}
