package defpackage;

import j$.util.Optional;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hxb {
    public static final hxb a = b().d();
    public final boolean b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final Optional f;

    public hxb(boolean z, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        this.b = z;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.f = optional4;
    }

    public static aase a(Map map) {
        if (map == null) {
            return b();
        }
        boolean zBooleanValue = ((Boolean) tym.T(map, "watch_start_paused", Boolean.FALSE)).booleanValue();
        Boolean bool = (Boolean) tym.U(map, "watch_mode_miniplayer", Boolean.class);
        Boolean bool2 = (Boolean) tym.U(map, "eligible_for_radio_transition", Boolean.class);
        abnh abnhVar = (abnh) tym.U(map, "client_driven_watch_next_params", abnh.class);
        aase aaseVarB = b();
        aaseVarB.g(zBooleanValue);
        if (bool != null) {
            bool.booleanValue();
            aaseVarB.c = Optional.of(bool);
        }
        if (bool2 != null) {
            aaseVarB.e(bool2.booleanValue());
        }
        if (abnhVar != null) {
            aaseVarB.d = Optional.of(abnhVar);
        }
        return aaseVarB;
    }

    public static aase b() {
        aase aaseVar = new aase((byte[]) null);
        aaseVar.g(false);
        return aaseVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hxb) {
            hxb hxbVar = (hxb) obj;
            if (this.b == hxbVar.b && this.c.equals(hxbVar.c) && this.d.equals(hxbVar.d) && this.e.equals(hxbVar.e) && this.f.equals(hxbVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        Optional optional2 = this.e;
        Optional optional3 = this.d;
        return "WatchStartParameters{watchStartPaused=" + this.b + ", watchStartModeMiniplayer=" + String.valueOf(this.c) + ", eligibleRadioTransition=" + String.valueOf(optional3) + ", latencyActionLogger=" + String.valueOf(optional2) + ", clientDrivenWatchNextParameters=" + String.valueOf(optional) + '}';
    }

    public hxb() {
        throw null;
    }
}
