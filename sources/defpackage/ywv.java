package defpackage;

import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.proto.streaming.CuepointListOuterClass$CuepointContext;
import com.google.android.apps.youtube.proto.streaming.TimeRangeOuterClass$TimeRange;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ywv extends yvs {
    private final CuepointListOuterClass$CuepointContext j;

    /* JADX WARN: Illegal instructions before constructor call */
    public ywv(CuepointListOuterClass$CuepointContext cuepointListOuterClass$CuepointContext) {
        int i;
        atzu atzuVar;
        atzu atzuVar2 = cuepointListOuterClass$CuepointContext.c;
        String str = (atzuVar2 == null ? atzu.a : atzuVar2).g;
        atzu atzuVar3 = cuepointListOuterClass$CuepointContext.c;
        int iAX = a.aX((atzuVar3 == null ? atzu.a : atzuVar3).c);
        int i2 = -1;
        int i3 = (iAX == 0 ? 1 : iAX) - 1;
        if (i3 == 1) {
            i = 2;
        } else if (i3 != 2) {
            if (i3 == 3) {
                i2 = 4;
            } else if (i3 == 5) {
                i = 1;
            } else if (i3 == 6) {
                i = 0;
            }
            i = i2;
        } else {
            i = 3;
        }
        if (atzuVar3 == null) {
            atzuVar3 = atzu.a;
            atzuVar = null;
        } else {
            atzuVar = atzuVar3;
        }
        double d = atzuVar3.e * 1000.0d;
        double d2 = (atzuVar == null ? atzu.a : atzuVar).d * 1000.0d;
        String str2 = (atzuVar == null ? atzu.a : atzuVar).f;
        int iAX2 = a.aX((atzuVar == null ? atzu.a : atzuVar).c);
        boolean z = iAX2 != 0 && iAX2 == 6;
        int i4 = cuepointListOuterClass$CuepointContext.b;
        super(str, i, (long) d, (long) d2, str2, z, (i4 & 32) != 0 ? cuepointListOuterClass$CuepointContext.e : -1L, (i4 & SemanticState.Focused) != 0 ? cuepointListOuterClass$CuepointContext.f : null, (i4 & SemanticState.Hidden) != 0 ? cuepointListOuterClass$CuepointContext.g : null);
        this.j = cuepointListOuterClass$CuepointContext;
    }

    @Override // defpackage.yvs
    public final long a() {
        CuepointListOuterClass$CuepointContext cuepointListOuterClass$CuepointContext = this.j;
        atzu atzuVar = cuepointListOuterClass$CuepointContext.c;
        if (atzuVar == null) {
            atzuVar = atzu.a;
        }
        atzuVar.getClass();
        if ((cuepointListOuterClass$CuepointContext.b & 8) != 0) {
            TimeRangeOuterClass$TimeRange defaultInstance = cuepointListOuterClass$CuepointContext.d;
            if (defaultInstance == null) {
                defaultInstance = TimeRangeOuterClass$TimeRange.getDefaultInstance();
            }
            if (defaultInstance.e > 0 && (atzuVar.b & 8) != 0) {
                TimeRangeOuterClass$TimeRange defaultInstance2 = cuepointListOuterClass$CuepointContext.d;
                long j = (defaultInstance2 == null ? TimeRangeOuterClass$TimeRange.getDefaultInstance() : defaultInstance2).c * 1000;
                if (defaultInstance2 == null) {
                    defaultInstance2 = TimeRangeOuterClass$TimeRange.getDefaultInstance();
                }
                return (j / ((long) defaultInstance2.e)) - ((long) (atzuVar.e * 1000.0d));
            }
        }
        if ((atzuVar.b & 64) != 0) {
            return (long) (atzuVar.h * 1000.0d);
        }
        return -1L;
    }
}
