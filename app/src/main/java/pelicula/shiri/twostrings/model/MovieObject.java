package pelicula.shiri.twostrings.model;

public class MovieObject {
    private int mId;
    private float mRating;
    private String mTitle, mGenre, mUserCount, mPoster;

    public MovieObject(int id, String title, String genre, float rating,
                            String users, String poster) {
        mId = id;
        mTitle = title;
        mGenre = genre;
        mRating = rating;
        mUserCount = users;
        mPoster = poster;
    }

    public int getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmGenre() {
        return mGenre;
    }

    public String getmUserCount() {
        return mUserCount;
    }

    public float getmRating() {
        return mRating;
    }

    public String getmPoster() {
        return mPoster;
    }
}
