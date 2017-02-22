package game.togheter.de;
/**
 * Das Gold objekt hat hier ein weiteres Attribute und zwar 'eingesammelt'
 * Dies wird in der Klasse Gold hinzugefügt.
 * 
 */
public class Gold extends SpielObjekt {
    private boolean eingesammelt;
    public Gold() {
        super(40,10);
        eingesammelt = false;
    }
    /**
     * Mittels goldWurdeEingesammelt setzen wir hier die variable auf true
     */
    public void goldWurdeEingesammelt() {
        eingesammelt = true;
    }
    /**
     * mittels wurdeGoldEingesammelt können wir prüfen, ob es bereits eingesammelt wurde
     */
    public boolean wurdeGoldEingesammelt() {
        return eingesammelt;
    }
}