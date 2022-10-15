package com.example.trainapp;

public class Element implements Comparable<Element> {
    public enum RotationDirection{
        FRONT, BACK, NONE
    }
    public enum Position {
        STRAIGHT, TUCK, PIKE, PUCK, STRADDLE
    }
    public enum LandingPos {
        FEET, SEAT, FRONT, BACK
    }

    private int id;
    private String elementNameDe;
    private String elementNameEn;
    private RotationDirection rotationDirection;
    private int noSaltoRot;
    private int noTwistFirstFlip;
    private int noTwistSecondFlip;
    private int getNoTwistThirdFlip;
    private Position position;
    private int diff;
    private LandingPos startingPos;
    private LandingPos landingPos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getElementNameDe() {
        return elementNameDe;
    }

    public void setElementNameDe(String elementNameDe) {
        this.elementNameDe = elementNameDe;
    }

    public String getElementNameEn() {
        return elementNameEn;
    }

    public void setElementNameEn(String elementNameEn) {
        this.elementNameEn = elementNameEn;
    }

    public RotationDirection getRotationDirection() {
        return rotationDirection;
    }

    public void setRotationDirection(RotationDirection rotationDirection) {
        this.rotationDirection = rotationDirection;
    }

    public int getNoSaltoRot() {
        return noSaltoRot;
    }

    public void setNoSaltoRot(int noSaltoRot) {
        this.noSaltoRot = noSaltoRot;
    }

    public int getNoTwistFirstFlip() {
        return noTwistFirstFlip;
    }

    public void setNoTwistFirstFlip(int noTwistFirstFlip) {
        this.noTwistFirstFlip = noTwistFirstFlip;
    }

    public int getNoTwistSecondFlip() {
        return noTwistSecondFlip;
    }

    public void setNoTwistSecondFlip(int noTwistSecondFlip) {
        this.noTwistSecondFlip = noTwistSecondFlip;
    }

    public int getGetNoTwistThirdFlip() {
        return getNoTwistThirdFlip;
    }

    public void setGetNoTwistThirdFlip(int getNoTwistThirdFlip) {
        this.getNoTwistThirdFlip = getNoTwistThirdFlip;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public LandingPos getStartingPos() {
        return startingPos;
    }

    public void setStartingPos(LandingPos startingPos) {
        this.startingPos = startingPos;
    }

    public LandingPos getLandingPos() {
        return landingPos;
    }

    public void setLandingPos(LandingPos landingPos) {
        this.landingPos = landingPos;
    }

    @Override
    public int compareTo(Element other) {
        return id - other.id;
    }
}
