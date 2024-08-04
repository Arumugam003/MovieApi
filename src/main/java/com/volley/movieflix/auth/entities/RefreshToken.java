package com.volley.movieflix.auth.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.Instant;



@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RefreshToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tokenId;

    @Column(nullable = false, length = 500)
    @NotBlank(message = "Please enter refresh token value!")
    private String refreshToken;

    @Column(nullable = false)
    private Instant expirationTime;

    @OneToOne
    private User user;
}

	/*public RefreshToken() {
		super();
	}

	public RefreshToken(Integer tokenId, @NotBlank(message = "Please enter refresh token value!") String refreshToken,
			Instant expirationTime, User user) {
		super();
		this.tokenId = tokenId;
		this.refreshToken = refreshToken;
		this.expirationTime = expirationTime;
		this.user = user;
	}
	
	public Integer getTokenId() {
		return tokenId;
	}

	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public Instant getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(Instant expirationTime) {
		this.expirationTime = expirationTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
//Create a pojo builder class
	public static RefreshTokenBuilder builder() {
 		return new RefreshTokenBuilder();
 	}
 	
 	public static class RefreshTokenBuilder {
 		private Integer tokenId;

 	    
 	    private String refreshToken;

 	   
 	    private Instant expirationTime;

 	   
 	    private User user;
 		
 		private RefreshTokenBuilder() {}
 		
 		public RefreshTokenBuilder tokenId( Integer tokenId) {
 			this.tokenId = tokenId;
 			return this;
 		}
 		
 		public RefreshTokenBuilder refreshToken( String refreshToken) {
 			this.refreshToken = refreshToken;
 			return this;
 		}
 		
 		public RefreshTokenBuilder expirationTime( Instant expirationTime) {
 			this.expirationTime = expirationTime;
 			return this;
 		}
 		
 		public RefreshTokenBuilder user( User user) {
 			this.user = user;
 			return this;
 		}
 		
 		 
 		
 		public RefreshToken build() {
 			return new RefreshToken( tokenId, refreshToken,
 					 expirationTime,  user);
 		}

		

		
}
*/
	
	





	 	
	 
	 	
	 






 

