package defpackage;

import android.net.Uri;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class sng {
    public static final Predicate a = new sde(7);

    public static agke a(List list) {
        if (list == null || list.isEmpty()) {
            return agpi.a;
        }
        agjz agjzVar = new agjz(4);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aivk aivkVar = (aivk) it.next();
            if (aivkVar != null && (aivkVar.b & 1) != 0) {
                try {
                    Uri uriC = tyu.c(aivkVar.c);
                    if (uriC != null && !Uri.EMPTY.equals(uriC)) {
                        agjzVar.h(uriC);
                    }
                } catch (MalformedURLException unused) {
                }
            }
        }
        return agjzVar.g();
    }

    public static agke b(smc smcVar, ogj ogjVar) {
        switch (ogjVar) {
            case START:
                return a(smcVar.ae());
            case FIRST_QUARTILE:
                return a(smcVar.V());
            case MIDPOINT:
                return a(smcVar.Z());
            case THIRD_QUARTILE:
                return a(smcVar.af());
            case COMPLETE:
                return a(smcVar.S());
            case RESUME:
                return a(smcVar.ac());
            case PAUSE:
                return a(smcVar.aa());
            case SUSPEND:
            case SWIPE:
            case MUTE:
            case UNMUTE:
                return agpi.a;
            case ABANDON:
                return a(smcVar.K());
            case SKIP_SHOWN:
                return a((List) Collection.EL.stream(smcVar.ab()).filter(a).collect(Collectors.toList()));
            case SKIP:
                return a(smcVar.ad());
            case VIEWABLE_IMPRESSION:
                return a(smcVar.P());
            case MEASURABLE_IMPRESSION:
                return a(smcVar.O());
            case GROUPM_VIEWABLE_IMPRESSION:
                return a(smcVar.N());
            case FULLSCREEN:
                return a(smcVar.W());
            case EXIT_FULLSCREEN:
                return a(smcVar.T());
            case AUDIO_AUDIBLE:
                return a(smcVar.L());
            case AUDIO_MEASURABLE:
                return a(smcVar.M());
            default:
                throw new RuntimeException(null, null);
        }
    }
}
