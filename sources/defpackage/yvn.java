package defpackage;

import com.google.protos.youtube.api.innertube.InnertubeDrmService$AuthorizedFormat;
import com.google.protos.youtube.api.innertube.InnertubeDrmService$LicenseResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yvn implements yvm {
    public final InnertubeDrmService$LicenseResponse a;
    public final agke b;
    private final Map c;

    public yvn(InnertubeDrmService$LicenseResponse innertubeDrmService$LicenseResponse) {
        zkf.d(innertubeDrmService$LicenseResponse);
        this.a = innertubeDrmService$LicenseResponse;
        if (innertubeDrmService$LicenseResponse.g.size() == 0) {
            this.b = agpi.a;
            this.c = Collections.EMPTY_MAP;
            return;
        }
        agjz agjzVar = new agjz(4);
        this.c = new HashMap();
        for (InnertubeDrmService$AuthorizedFormat innertubeDrmService$AuthorizedFormat : innertubeDrmService$LicenseResponse.g) {
            agjzVar.h(innertubeDrmService$AuthorizedFormat);
            Map map = this.c;
            String strC = aaqc.c(innertubeDrmService$AuthorizedFormat.d.G());
            akvr akvrVarA = akvr.a(innertubeDrmService$AuthorizedFormat.c);
            if (akvrVarA == null) {
                akvrVarA = akvr.DRM_TRACK_TYPE_UNSPECIFIED;
            }
            map.put(strC, Integer.valueOf(akvrVarA.g));
        }
        this.b = agjzVar.g();
    }

    @Override // defpackage.yvm
    public final String a() {
        return this.a.d;
    }

    @Override // defpackage.yvm
    public final boolean b() {
        zkf.c(!c());
        return this.a.e;
    }

    @Override // defpackage.yvm
    public final boolean c() {
        int iAS = a.aS(this.a.c);
        return iAS != 0 && iAS == 2;
    }

    public final String toString() {
        return "";
    }
}
