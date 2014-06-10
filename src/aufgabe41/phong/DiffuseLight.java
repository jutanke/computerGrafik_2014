package aufgabe41.phong;

import aufgabe41.Utils;
import aufgabe41.Vector3;

/**
 * Created by Julian on 10.06.2014.
 */
public class DiffuseLight implements Light {

    private final Vector3 p, c;

    public DiffuseLight(Vector3 pos, Vector3 c){
        this.p = pos;
        this.c = c;
    }

    @Override
    public Vector3 color() {
        return this.c;
    }

    @Override
    public Vector3 position() {
        return this.p;
    }

    /**
     * @param P position of the Element
     * @param N Normal of the Element
     * @param V Direction of the Viewer
     * @param K Material coefficient
     * @return Intensity (RGB)
     */
    public Vector3 intensity(Vector3 P, Vector3 N, Vector3 V, Vector3 K){
        Vector3 L = this.p.subtract(P);
        N.normalize();
        V.normalize();
        Vector3 R = L.reflect(N);
        double diffuseLight = N.multiply(L);
        double specularLight = V.multiply(R);
        if (diffuseLight > 0){
            double cosTheta = Utils.clamp(N.multiply(L),0,1);

        }

        return null;
    }

}