/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

/**
 *
 * @author sfogo
 */
/*
 *edited by stan
 *
*/public class Drawnings { 
    private String game;
    private String draw;
    private int ball1; 
    private int ball2;
    private int ball3;
    private int ball4;
    private int ball5;
    private int powerBall;
    private int powerPlay;
    
    public Drawnings(String game, String draw, int ball1, int ball2, int ball3, 
            int ball4, int ball5, int powerBall, int powerPlay) { 
        this.game = game; 
        this.draw = draw; 
        this.ball1 = ball1;
        this.ball2 = ball2;
        this.ball3 = ball3;
        this.ball4 = ball4;
        this.ball5 = ball5;
        this.powerBall = powerBall;
        this.powerPlay = powerPlay;
        
        CSVReaderInJava.Count(ball1, ball2, ball3, ball4, ball5, powerBall);
        
    } 

	public String getGame() { 
        return game; 
    } 
    public void setGame(String game) { 
        this.game = game; 
    } 
    
    public String getDraw() { 
        return draw; 
    } 
    public void setDraw(String draw) { 
        this.draw = draw; 
    }
    
    public int getBall1() { 
        return ball1; 
    } 
    public void setBall1(int ball1) { 
        this.ball1 = ball1; 
    }
    
    public int getBall2() { 
        return ball2; 
    } 
    public void setBall2(int ball2) { 
        this.ball2 = ball2; 
    }
    
    public int getBall3() { 
        return ball3; 
    } 
    public void setBall3(int ball3) { 
        this.ball3 = ball3; 
    }
    
    public int getBall4() { 
        return ball4; 
    } 
    public void setBall4(int ball4) { 
        this.ball4 = ball4; 
    }
    
    public int getBall5() { 
        return ball5; 
    } 
    public void setBall5(int ball5) { 
        this.ball5 = ball5; 
    }
    
    public int getPowerBall() { 
        return powerBall; 
    } 
    public void setPowerBall(int powerBall) { 
        this.powerBall = powerBall; 
    }
    
    public int getPowerPlay() { 
        return powerPlay; 
    } 
    public void setPowerPlay(int powerPlay) { 
        this.powerPlay = powerPlay; 
    }
    
     
    
    @Override 
    public String toString() { 
        /*return "Game=" + game + ", Draw=" + draw + ", Ball 1=" + ball1 +
                ", Ball 2=" + ball2 + ", Ball 3=" + ball3 + ", Ball 4=" + ball4 +
                ", Ball 5=" + ball4 + ", Power Ball=" + powerBall + ", Power Play=" + powerPlay;*/
        return "Game=" + game + ", Draw=" + draw + ", Ball 1=" + ball1 +
                ", Ball 2=" + ball2 + ", Ball 3=" + ball3 + ", Ball 4=" + ball4 +
                ", Ball 5=" + ball4 + ", Power Ball=" + powerBall + ", Power Play=" + powerPlay;
    } 
}
