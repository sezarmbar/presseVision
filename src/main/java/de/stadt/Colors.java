package de.stadt;

public class Colors{
    Color color;
    Double pixelFraction;
    Double score;

    public Colors() {
    }

    public Colors(Color color, Double pixelFraction, Double score) {
        this.color = color;
        this.pixelFraction = pixelFraction;
        this.score = score;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getPixelFraction() {
        return pixelFraction;
    }

    public void setPixelFraction(Double pixelFraction) {
        this.pixelFraction = pixelFraction;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}


class Color {
    Double blue;
    Double green;
    Double red;

    public Color() {
    }

    public Color(Double blue, Double green, Double red) {
        this.blue = blue;
        this.green = green;
        this.red = red;
    }

    public Double getBlue() {
        return blue;
    }

    public void setBlue(Double blue) {
        this.blue = blue;
    }

    public Double getGreen() {
        return green;
    }

    public void setGreen(Double green) {
        this.green = green;
    }

    public Double getRed() {
        return red;
    }

    public void setRed(Double red) {
        this.red = red;

    }
}
