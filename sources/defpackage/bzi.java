package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bzi extends bxw {
    private final byte[] a;
    private final DatagramPacket b;
    private Uri c;
    private DatagramSocket d;
    private MulticastSocket e;
    private InetAddress f;
    private boolean g;
    private int h;

    public bzi() {
        super(true);
        byte[] bArr = new byte[2000];
        this.a = bArr;
        this.b = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.brv
    public final int a(byte[] bArr, int i, int i2) throws bzh {
        if (i2 == 0) {
            return 0;
        }
        if (this.h == 0) {
            try {
                DatagramSocket datagramSocket = this.d;
                datagramSocket.getClass();
                datagramSocket.receive(this.b);
                int length = this.b.getLength();
                this.h = length;
                g(length);
            } catch (SocketTimeoutException e) {
                throw new bzh(e, 2002);
            } catch (IOException e2) {
                throw new bzh(e2, 2001);
            }
        }
        int length2 = this.b.getLength();
        int i3 = this.h;
        int iMin = Math.min(i3, i2);
        System.arraycopy(this.a, length2 - i3, bArr, i, iMin);
        this.h -= iMin;
        return iMin;
    }

    @Override // defpackage.bye
    public final long b(byi byiVar) throws bzh {
        Uri uri = byiVar.a;
        this.c = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.c.getPort();
        i(byiVar);
        try {
            this.f = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f, port);
            if (this.f.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.e = multicastSocket;
                multicastSocket.joinGroup(this.f);
                this.d = this.e;
            } else {
                this.d = new DatagramSocket(inetSocketAddress);
            }
            this.d.setSoTimeout(8000);
            this.g = true;
            j(byiVar);
            return -1L;
        } catch (IOException e) {
            throw new bzh(e, 2001);
        } catch (SecurityException e2) {
            throw new bzh(e2, 2006);
        }
    }

    @Override // defpackage.bye
    public final Uri c() {
        return this.c;
    }

    @Override // defpackage.bye
    public final void f() {
        this.c = null;
        MulticastSocket multicastSocket = this.e;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.e = null;
        }
        DatagramSocket datagramSocket = this.d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.d = null;
        }
        this.f = null;
        this.h = 0;
        if (this.g) {
            this.g = false;
            h();
        }
    }
}
