package afc

import org.joda.time.*

class Match {
	
	LocalDateTime date
	String place
	
	static belongsTo = [home: Team, away: Team]
	
	static hasMany = [comments: Comment, commentators: MatchCommentator]
	
    static	mapping = {
    }
    
	static	constraints = {
    }
	
}
