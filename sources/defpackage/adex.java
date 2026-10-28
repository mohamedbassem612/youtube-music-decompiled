package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import app.rive.semantics.SemanticState;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adex {
    public static final /* synthetic */ int a = 0;

    static {
        Duration.ofMillis(200L);
    }

    public static PointF a(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float y = 0.0f;
        float x = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            x += motionEvent.getX(i);
            y += motionEvent.getY(i);
        }
        float f = pointerCount;
        return new PointF(x / f, y / f);
    }

    public static RectF b(Drawable drawable) {
        return new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public static amiu c(String str, Boolean bool, Boolean bool2, String str2) {
        aihf aihfVarCreateBuilder = amiq.a.createBuilder();
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            amiq amiqVar = (amiq) aihfVarCreateBuilder.instance;
            amiqVar.b |= 1;
            amiqVar.c = str;
        }
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            aihfVarCreateBuilder.copyOnWrite();
            amiq amiqVar2 = (amiq) aihfVarCreateBuilder.instance;
            amiqVar2.b |= 4;
            amiqVar2.e = zBooleanValue;
        }
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            aihfVarCreateBuilder.copyOnWrite();
            amiq amiqVar3 = (amiq) aihfVarCreateBuilder.instance;
            amiqVar3.b |= 2;
            amiqVar3.d = zBooleanValue2;
        }
        aihf aihfVarCreateBuilder2 = amiu.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        amiu amiuVar = (amiu) aihfVarCreateBuilder2.instance;
        amiuVar.f = 268;
        amiuVar.b |= 4;
        amiq amiqVar4 = (amiq) aihfVarCreateBuilder.build();
        aihfVarCreateBuilder2.copyOnWrite();
        amiu amiuVar2 = (amiu) aihfVarCreateBuilder2.instance;
        amiqVar4.getClass();
        amiuVar2.P = amiqVar4;
        amiuVar2.d |= SemanticState.LiveRegion;
        if (str2 != null) {
            aihfVarCreateBuilder2.copyOnWrite();
            amiu amiuVar3 = (amiu) aihfVarCreateBuilder2.instance;
            amiuVar3.b |= 32;
            amiuVar3.i = str2;
        }
        return (amiu) aihfVarCreateBuilder2.build();
    }
}
