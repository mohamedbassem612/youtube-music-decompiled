package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import com.google.android.apps.youtube.music.mediabrowser.waze.MusicWazeBroadcastReceiver;
import internal.org.jni_zero.CommonApis;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aumt extends FrameLayout implements aumx {
    private static final int[] d = {0, R.drawable.big_direction_left, R.drawable.big_direction_right, R.drawable.big_direction_exit_left, R.drawable.big_direction_exit_right, R.drawable.big_direction_forward, R.drawable.big_directions_roundabout, R.drawable.big_directions_roundabout, R.drawable.big_directions_roundabout_l, R.drawable.big_directions_roundabout_l, R.drawable.big_directions_roundabout_s, R.drawable.big_directions_roundabout_s, R.drawable.big_directions_roundabout_r, R.drawable.big_directions_roundabout_r, R.drawable.big_directions_roundabout_u, R.drawable.big_directions_roundabout_u, R.drawable.big_direction_end, R.drawable.big_direction_exit_left, R.drawable.big_direction_exit_right, 0, R.drawable.big_directions_uturn};
    private static final int[] e = {0, R.drawable.big_direction_left, R.drawable.big_direction_right, R.drawable.big_direction_exit_left, R.drawable.big_direction_exit_right, R.drawable.big_direction_forward, R.drawable.big_directions_roundabout_lhs, R.drawable.big_directions_roundabout_lhs, R.drawable.big_directions_roundabout_l_lhs, R.drawable.big_directions_roundabout_l_lhs, R.drawable.big_directions_roundabout_s_lhs, R.drawable.big_directions_roundabout_s_lhs, R.drawable.big_directions_roundabout_r_lhs, R.drawable.big_directions_roundabout_r_lhs, R.drawable.big_directions_roundabout_u_lhs, R.drawable.big_directions_roundabout_u_lhs, R.drawable.big_direction_end, R.drawable.big_direction_exit_left, R.drawable.big_direction_exit_right, 0, R.drawable.big_directions_uturn_lhs};
    public boolean a;
    public final List b;
    public hhb c;
    private final View f;
    private final View g;
    private final ImageView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final View.OnClickListener l;
    private BroadcastReceiver m;
    private boolean n;
    private boolean o;
    private final boolean p;

    public aumt(Context context) {
        char c;
        ColorFilter colorMatrixColorFilter;
        super(context, null, 0);
        hxg hxgVar = new hxg(this, 14);
        this.l = hxgVar;
        this.b = new ArrayList();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.waze_navigation_bar, this);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, aunc.a, 0, R.style.WazeNavBarBlue);
        int color = typedArrayObtainStyledAttributes.getColor(2, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(1, -1);
        this.p = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        setOnClickListener(new hxg(this, 15));
        View viewFindViewById = findViewById(R.id.wazeNavBarGeneralLayout);
        this.f = viewFindViewById;
        viewFindViewById.setBackgroundColor(color2);
        View viewFindViewById2 = findViewById(R.id.wazeNavBarNavigationLayout);
        this.g = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.wazeNavBarInstruction);
        this.h = imageView;
        float f = (color >> 16) & 255;
        float f2 = (color >> 8) & 255;
        float f3 = color & 255;
        if ((0.2126f * f) + (0.7152f * f2) + (0.0722f * f3) > 127.0f) {
            colorMatrixColorFilter = new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY);
            c = 0;
        } else {
            c = 0;
            colorMatrixColorFilter = new ColorMatrixColorFilter(new ColorMatrix(new float[]{(f / 255.0f) - 1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, (f2 / 255.0f) - 1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, (f3 / 255.0f) - 1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
        imageView.setColorFilter(colorMatrixColorFilter);
        TextView textView = (TextView) findViewById(R.id.wazeNavBarRoundaboutExitNumber);
        this.k = textView;
        textView.setTextColor(color);
        TextView textView2 = (TextView) findViewById(R.id.wazeNavBarStreetName);
        this.i = textView2;
        textView2.setTextColor(color);
        TextView textView3 = (TextView) findViewById(R.id.wazeNavBarDistance);
        this.j = textView3;
        textView3.setTextColor(color);
        viewFindViewById2.setBackgroundColor(color2);
        ImageView imageView2 = (ImageView) viewFindViewById.findViewById(R.id.wazeNavBarCloseButton);
        if (imageView2 != null) {
            imageView2.setOnClickListener(hxgVar);
            imageView2.setColorFilter(color);
        }
        ((TextView) findViewById(R.id.wazeNavBarStartWazeText)).setTextColor(color);
        ((TextView) findViewById(R.id.wazeNavBarStartWazeDescription)).setTextColor(color);
        TextView textView4 = (TextView) findViewById(R.id.wazeNavBarStartWazeDescription);
        Resources resources = getResources();
        Object[] objArr = new Object[1];
        objArr[c] = getContext().getApplicationInfo().loadLabel(getContext().getPackageManager());
        textView4.setText(resources.getString(R.string.waze_nav_bar_see_waze_direction, objArr));
        auna.c.a.add(new WeakReference(this));
        WeakReference weakReference = auna.b;
        auna aunaVar = weakReference == null ? null : (auna) weakReference.get();
        if (aunaVar != null && aunaVar.g) {
            aunaVar.a();
        }
        n();
    }

    protected static final boolean k(BluetoothDevice bluetoothDevice) {
        try {
            int deviceClass = bluetoothDevice.getBluetoothClass().getDeviceClass();
            return deviceClass == 1056 || deviceClass == 1032;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean l() {
        WeakReference weakReference = auna.b;
        return (weakReference == null || weakReference.get() == null || !((auna) auna.b.get()).g) ? false : true;
    }

    private final void n() {
        boolean z = this.a;
        View view = this.f;
        if (z) {
            view.setVisibility(8);
            this.g.setVisibility(0);
        } else {
            view.setVisibility(0);
            this.g.setVisibility(8);
            this.h.setImageResource(0);
            this.j.setText((CharSequence) null);
        }
    }

    @Override // defpackage.aunb
    public final void a() {
        n();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((auna) auna.b.get()).d((axoz) it.next());
        }
        if (this.n) {
            h();
        }
    }

    @Override // defpackage.aunb
    public final void b() {
        this.a = false;
        this.n = false;
        n();
    }

    public final void c() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            setVisibility(8);
        } else if (defaultAdapter.getProfileConnectionState(1) == 2) {
            defaultAdapter.getProfileProxy(getContext(), new aums(this), 1);
        }
    }

    @Override // defpackage.aumw
    public final void d(boolean z) {
        this.a = z;
        n();
    }

    @Override // defpackage.aumw
    public final void e(int i) {
        TextView textView = this.k;
        if (i > 0) {
            textView.setText(Integer.toString(i));
        } else {
            textView.setText((CharSequence) null);
        }
    }

    @Override // defpackage.aumw
    public final void f(String str) {
        this.i.setText(str);
    }

    @Override // defpackage.aumw
    public final void g(boolean z) {
        this.o = z;
    }

    public final void h() {
        if (l()) {
            this.n = false;
            auna aunaVar = (auna) auna.b.get();
            Messenger messenger = aunaVar.e;
            if (messenger != null) {
                try {
                    String str = aunaVar.d;
                    Message messageObtain = Message.obtain((Handler) null, 101);
                    Bundle bundle = new Bundle();
                    bundle.putString("token", str);
                    messageObtain.setData(bundle);
                    messenger.send(messageObtain);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            }
            return;
        }
        if (this.n) {
            return;
        }
        if (CommonApis.m(getContext()) == null) {
            Context context = getContext();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?").buildUpon().appendQueryParameter("id", "com.waze").appendQueryParameter("referrer", "utm_source=partner&utm_medium=direct&utm_campaign=".concat(String.valueOf(context.getPackageName()))).build());
            intent.addFlags(268435456);
            context.startActivity(intent);
            return;
        }
        hhb hhbVar = this.c;
        if (hhbVar != null) {
            Context context2 = ((hkc) hhbVar.a).b;
            Intent intent2 = new Intent(context2, (Class<?>) MusicWazeBroadcastReceiver.class);
            intent2.setAction("com.waze.sdk.audio.ACTION_INIT");
            context2.sendBroadcast(intent2);
        }
        this.n = true;
    }

    protected final boolean i(BluetoothDevice bluetoothDevice, boolean z) {
        if (!z) {
            return false;
        }
        bluetoothDevice.getName();
        setVisibility(0);
        return true;
    }

    @Override // defpackage.aumw
    public final void j(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        this.h.setImageResource(this.o ? e[i2] : d[i2]);
        this.k.setText((CharSequence) null);
    }

    @Override // defpackage.aumw
    public final void m(String str) {
        this.j.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        if (this.p) {
            if (avg.c(getContext(), "android.permission.BLUETOOTH") == 0) {
                setVisibility(8);
                c();
                if (this.m == null) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                    intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
                    intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
                    intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECT_REQUESTED");
                    this.m = new aumr(this);
                    getContext().registerReceiver(this.m, intentFilter);
                }
            } else {
                setVisibility(8);
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.m != null) {
            getContext().unregisterReceiver(this.m);
            this.m = null;
        }
    }
}
