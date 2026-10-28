package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class diu extends div implements din, dip {
    private static final ArrayList q;
    private static final ArrayList r;
    protected final MediaRouter a;
    protected final MediaRouter.Callback b;
    protected final MediaRouter.VolumeCallback c;
    protected final MediaRouter.RouteCategory d;
    protected int e;
    protected boolean m;
    protected boolean n;
    protected final ArrayList o;
    protected final ArrayList p;
    private final dgr s;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        q = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        r = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public diu(Context context, dgr dgrVar) {
        super(context);
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.s = dgrVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.a = mediaRouter;
        this.b = new dio(this);
        this.c = new diq(this);
        this.d = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        A();
    }

    private final void A() {
        if (this.n) {
            this.a.removeCallback(this.b);
        }
        this.n = true;
        int i = (this.m ? 1 : 0) | 2;
        MediaRouter mediaRouter = this.a;
        mediaRouter.addCallback(this.e, this.b, i);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zB = false;
        for (int i2 = 0; i2 < routeCount; i2++) {
            arrayList.add(mediaRouter.getRouteAt(i2));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zB |= B((MediaRouter.RouteInfo) it.next());
        }
        if (zB) {
            v();
        }
    }

    private final boolean B(MediaRouter.RouteInfo routeInfo) {
        String str;
        if (x(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        String str2 = this.a.getDefaultRoute() == routeInfo ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(r(routeInfo).hashCode()));
        if (p(str2) >= 0) {
            int i = 2;
            while (true) {
                str = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i));
                if (p(str) < 0) {
                    break;
                }
                i++;
            }
            str2 = str;
        }
        ahto ahtoVar = new ahto(routeInfo, str2);
        z(ahtoVar);
        this.o.add(ahtoVar);
        return true;
    }

    protected static final dit x(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof dit) {
            return (dit) tag;
        }
        return null;
    }

    protected static final void y(dit ditVar) {
        MediaRouter.UserRouteInfo userRouteInfo = ditVar.b;
        dii diiVar = ditVar.a;
        userRouteInfo.setName(diiVar.e);
        userRouteInfo.setPlaybackType(diiVar.m);
        userRouteInfo.setPlaybackStream(diiVar.n);
        userRouteInfo.setVolume(diiVar.p);
        userRouteInfo.setVolumeMax(diiVar.q);
        userRouteInfo.setVolumeHandling(diiVar.b());
        userRouteInfo.setDescription(diiVar.f);
    }

    @Override // defpackage.din
    public final void a(MediaRouter.RouteInfo routeInfo) {
        if (B(routeInfo)) {
            v();
        }
    }

    @Override // defpackage.din
    public final void b(MediaRouter.RouteInfo routeInfo) {
        int iO;
        if (x(routeInfo) != null || (iO = o(routeInfo)) < 0) {
            return;
        }
        z((ahto) this.o.get(iO));
        v();
    }

    @Override // defpackage.dhp
    public final dhn c(String str) {
        int iP = p(str);
        if (iP >= 0) {
            return new dis((MediaRouter.RouteInfo) ((ahto) this.o.get(iP)).a);
        }
        return null;
    }

    @Override // defpackage.din
    public final void d(MediaRouter.RouteInfo routeInfo) {
        int iO = o(routeInfo);
        if (iO >= 0) {
            ahto ahtoVar = (ahto) this.o.get(iO);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != ((dhg) ahtoVar.c).g()) {
                dhf dhfVar = new dhf((dhg) ahtoVar.c);
                dhfVar.k(displayId);
                ahtoVar.c = dhfVar.a();
                v();
            }
        }
    }

    @Override // defpackage.dhp
    public final void e(dhh dhhVar) {
        boolean zB;
        int i = 0;
        if (dhhVar != null) {
            List listB = dhhVar.a().b();
            int size = listB.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) listB.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else {
                    i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                }
                i++;
            }
            zB = dhhVar.b();
            i = i2;
        } else {
            zB = false;
        }
        if (this.e == i && this.m == zB) {
            return;
        }
        this.e = i;
        this.m = zB;
        A();
    }

    @Override // defpackage.din
    public final void f(MediaRouter.RouteInfo routeInfo) {
        int iO;
        if (x(routeInfo) != null || (iO = o(routeInfo)) < 0) {
            return;
        }
        this.o.remove(iO);
        v();
    }

    @Override // defpackage.din
    public final void g(MediaRouter.RouteInfo routeInfo) {
        int iO;
        if (x(routeInfo) != null || (iO = o(routeInfo)) < 0) {
            return;
        }
        ahto ahtoVar = (ahto) this.o.get(iO);
        int volume = routeInfo.getVolume();
        if (volume != ((dhg) ahtoVar.c).h()) {
            dhf dhfVar = new dhf((dhg) ahtoVar.c);
            dhfVar.l(volume);
            ahtoVar.c = dhfVar.a();
            v();
        }
    }

    @Override // defpackage.din
    public final void i(MediaRouter.RouteInfo routeInfo) {
        dii diiVarC;
        if (routeInfo == this.a.getSelectedRoute(8388611)) {
            dit ditVarX = x(routeInfo);
            if (ditVarX != null) {
                ditVarX.a.i(false);
                return;
            }
            int iO = o(routeInfo);
            if (iO >= 0) {
                ahto ahtoVar = (ahto) this.o.get(iO);
                dgr dgrVar = this.s;
                Object obj = ahtoVar.b;
                dgrVar.b.removeMessages(262);
                dih dihVarC = dgrVar.c(dgrVar.p);
                if (dihVarC == null || (diiVarC = dihVarC.c((String) obj)) == null) {
                    return;
                }
                dgrVar.m(diiVarC, 3, 2, false);
            }
        }
    }

    @Override // defpackage.dip
    public final void l(MediaRouter.RouteInfo routeInfo, int i) {
        dit ditVarX = x(routeInfo);
        if (ditVarX != null) {
            ditVarX.a.g(i);
        }
    }

    @Override // defpackage.dip
    public final void m(MediaRouter.RouteInfo routeInfo, int i) {
        dit ditVarX = x(routeInfo);
        if (ditVarX != null) {
            ditVarX.a.h(i);
        }
    }

    protected void n(ahto ahtoVar, dhf dhfVar) {
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) ahtoVar.a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            dhfVar.c(q);
        }
        if ((supportedTypes & 2) != 0) {
            dhfVar.c(r);
        }
        dhfVar.j(routeInfo.getPlaybackType());
        int playbackStream = routeInfo.getPlaybackStream();
        Bundle bundle = (Bundle) dhfVar.b;
        bundle.putInt("playbackStream", playbackStream);
        dhfVar.l(routeInfo.getVolume());
        dhfVar.n(routeInfo.getVolumeMax());
        dhfVar.m(routeInfo.getVolumeHandling());
        bundle.putBoolean("isSystemRoute", (supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            dhfVar.h(false);
        }
        if (routeInfo.isConnecting()) {
            dhfVar.e(1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            dhfVar.k(presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            dhfVar.f(description.toString());
        }
    }

    protected final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ahto) arrayList.get(i)).a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    protected final int p(String str) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((String) ((ahto) arrayList.get(i)).b).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    protected final int q(dii diiVar) {
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((dit) arrayList.get(i)).a == diiVar) {
                return i;
            }
        }
        return -1;
    }

    protected final String r(MediaRouter.RouteInfo routeInfo) {
        int i;
        Context context = this.f;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) != 0) {
            return "";
        }
        int deviceType = routeInfo.getDeviceType();
        if (deviceType == 1) {
            i = R.string.mr_route_name_tv;
        } else if (deviceType != 2) {
            i = deviceType != 3 ? R.string.mr_route_name_unknown : R.string.mr_route_name_bluetooth;
        } else {
            i = R.string.mr_route_name_speaker;
        }
        return context.getString(i);
    }

    @Override // defpackage.div
    public final void s(dii diiVar) {
        dhp dhpVarD = diiVar.d();
        MediaRouter mediaRouter = this.a;
        if (dhpVarD != this) {
            MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.d);
            dit ditVar = new dit(diiVar, userRouteInfoCreateUserRoute);
            userRouteInfoCreateUserRoute.setTag(ditVar);
            userRouteInfoCreateUserRoute.setVolumeCallback(this.c);
            y(ditVar);
            this.p.add(ditVar);
            mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
            return;
        }
        int iO = o(mediaRouter.getSelectedRoute(8388611));
        if (iO >= 0) {
            if (((String) ((ahto) this.o.get(iO)).b).equals(diiVar.c)) {
                diiVar.i(false);
            }
        }
    }

    @Override // defpackage.div
    public final void t(dii diiVar) {
        int iQ;
        if (diiVar.d() == this || (iQ = q(diiVar)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((dit) this.p.remove(iQ)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.a.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException e) {
            Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e);
        }
    }

    @Override // defpackage.div
    public final void u(dii diiVar) {
        if (diiVar.o()) {
            if (diiVar.d() != this) {
                int iQ = q(diiVar);
                if (iQ >= 0) {
                    w(((dit) this.p.get(iQ)).b);
                    return;
                }
                return;
            }
            int iP = p(diiVar.c);
            if (iP >= 0) {
                w((MediaRouter.RouteInfo) ((ahto) this.o.get(iP)).a);
            }
        }
    }

    protected final void v() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.o;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            azs.C((dhg) ((ahto) arrayList2.get(i)).c, arrayList);
        }
        gz(new dhq(arrayList, false));
    }

    protected final void w(MediaRouter.RouteInfo routeInfo) {
        this.a.selectRoute(8388611, routeInfo);
    }

    protected final void z(ahto ahtoVar) {
        dhf dhfVar = new dhf((String) ahtoVar.b, r((MediaRouter.RouteInfo) ahtoVar.a));
        n(ahtoVar, dhfVar);
        ahtoVar.c = dhfVar.a();
    }

    @Override // defpackage.din
    public final void h() {
    }

    @Override // defpackage.din
    public final void j() {
    }

    @Override // defpackage.din
    public final void k() {
    }
}
