package digi.pankaj.gamingmaster.Modal;

public class RecyclerModal {
    String imageUrl, gameName, logoUrl, category;
    Boolean mode;

    public RecyclerModal(String imageUrl, String gameName, String logoUrl, String category, Boolean mode) {
        this.imageUrl = imageUrl;
        this.gameName = gameName;
        this.logoUrl = logoUrl;
        this.category = category;
        this.mode = mode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getMode() {
        return mode;
    }

    public void setMode(Boolean mode) {
        this.mode = mode;
    }
}
