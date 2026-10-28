package defpackage;

import android.view.View;
import app.rive.semantics.SemanticState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjp {
    public final int a;
    boolean b;
    String c;

    public fjp(Object obj) {
        this.a = a(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    static int a(Object obj) {
        ?? r0;
        if (!(obj instanceof View)) {
            return 0;
        }
        View view = (View) obj;
        boolean zIsClickable = view.isClickable();
        if (view.isLongClickable()) {
            r0 = zIsClickable;
            r0 = (zIsClickable ? 1 : 0) | 2;
        }
        r0 = zIsClickable;
        ?? r1 = r0;
        if (view.isContextClickable()) {
            r1 = (r0 == true ? 1 : 0) | SemanticState.Focused;
        }
        ?? r2 = r1;
        if (view.isFocusable()) {
            r2 = (r1 == true ? 1 : 0) | 4;
        }
        ?? r3 = r2;
        if (view.isEnabled()) {
            r3 = (r2 == true ? 1 : 0) | 8;
        }
        ?? r4 = r3;
        if (view.isSelected()) {
            r4 = (r3 == true ? 1 : 0) | 16;
        }
        int layerType = view.getLayerType();
        if (layerType == 0) {
            return r4;
        }
        if (layerType == 1) {
            return r4 | 32;
        }
        if (layerType == 2) {
            return r4 | 64;
        }
        throw new IllegalArgumentException("Unhandled layer type encountered.");
    }

    public static fjp b(fvi fviVar) {
        Object obj = fviVar.e;
        if (obj instanceof fjp) {
            return (fjp) obj;
        }
        throw new RuntimeException("MountData should not be null when using Litho's MountState.");
    }
}
