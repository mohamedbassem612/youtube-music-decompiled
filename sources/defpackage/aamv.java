package defpackage;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aamv implements aamb {
    private final Map a;

    public aamv(byte[] bArr) {
        HashMap map = new HashMap();
        this.a = map;
        if (bArr.length > 0) {
            synchronized (map) {
                try {
                    map.clear();
                    DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
                    int i = dataInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        String utf = dataInputStream.readUTF();
                        byte b = dataInputStream.readByte();
                        switch (b) {
                            case 1:
                                this.a.put(utf, dataInputStream.readUTF());
                                break;
                            case 2:
                                int i3 = dataInputStream.readInt();
                                String[] strArr = new String[i3];
                                for (int i4 = 0; i4 < i3; i4++) {
                                    strArr[i4] = dataInputStream.readUTF();
                                }
                                this.a.put(utf, strArr);
                                break;
                            case 3:
                                this.a.put(utf, Long.valueOf(dataInputStream.readLong()));
                                break;
                            case 4:
                                int i5 = dataInputStream.readInt();
                                long[] jArr = new long[i5];
                                for (int i6 = 0; i6 < i5; i6++) {
                                    jArr[i6] = dataInputStream.readLong();
                                }
                                this.a.put(utf, jArr);
                                break;
                            case 5:
                                this.a.put(utf, Integer.valueOf(dataInputStream.readInt()));
                                break;
                            case 6:
                                int i7 = dataInputStream.readInt();
                                int[] iArr = new int[i7];
                                for (int i8 = 0; i8 < i7; i8++) {
                                    iArr[i8] = dataInputStream.readInt();
                                }
                                this.a.put(utf, iArr);
                                break;
                            case 7:
                                this.a.put(utf, Boolean.valueOf(dataInputStream.readBoolean()));
                                break;
                            case 8:
                                int i9 = dataInputStream.readInt();
                                boolean[] zArr = new boolean[i9];
                                for (int i10 = 0; i10 < i9; i10++) {
                                    zArr[i10] = dataInputStream.readBoolean();
                                }
                                this.a.put(utf, zArr);
                                break;
                            case 9:
                                this.a.put(utf, Byte.valueOf(dataInputStream.readByte()));
                                break;
                            case 10:
                                int i11 = dataInputStream.readInt();
                                byte[] bArr2 = new byte[i11];
                                int i12 = 0;
                                while (i12 < i11) {
                                    int i13 = dataInputStream.read(bArr2, i12, i11 - i12);
                                    if (i13 == -1) {
                                        throw new IOException("Unexpected end of stream");
                                    }
                                    i12 += i13;
                                }
                                this.a.put(utf, bArr2);
                                break;
                            case 11:
                                this.a.put(utf, Double.valueOf(dataInputStream.readDouble()));
                                break;
                            default:
                                throw new RuntimeException(a.bR(b, "Couldn't read extra of type: "));
                        }
                    }
                    dataInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override // defpackage.aamb
    public final int a(String str) {
        return b("stream_quality", 0);
    }

    @Override // defpackage.aamb
    public final int b(String str, int i) {
        Map map = this.a;
        return map.containsKey(str) ? ((Integer) map.get(str)).intValue() : i;
    }

    @Override // defpackage.aamb
    public final long c(String str) {
        return d(str, 0L);
    }

    @Override // defpackage.aamb
    public final long d(String str, long j) {
        Map map = this.a;
        return map.containsKey(str) ? ((Long) map.get(str)).longValue() : j;
    }

    public final String e(String str, String str2) {
        Map map = this.a;
        return map.containsKey(str) ? (String) map.get(str) : str2;
    }

    @Override // defpackage.aamb
    public final String f(String str) {
        return e(str, null);
    }

    public final byte[] g() {
        byte[] byteArray;
        Map map = this.a;
        synchronized (map) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    dataOutputStream.writeUTF((String) entry.getKey());
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        dataOutputStream.writeByte(1);
                        dataOutputStream.writeUTF((String) value);
                    } else {
                        int i = 0;
                        if (value instanceof String[]) {
                            dataOutputStream.writeByte(2);
                            String[] strArr = (String[]) value;
                            dataOutputStream.writeInt(strArr.length);
                            while (i < strArr.length) {
                                dataOutputStream.writeUTF(strArr[i]);
                                i++;
                            }
                        } else if (value instanceof Long) {
                            dataOutputStream.writeByte(3);
                            dataOutputStream.writeLong(((Long) value).longValue());
                        } else if (value instanceof long[]) {
                            dataOutputStream.writeByte(4);
                            long[] jArr = (long[]) value;
                            dataOutputStream.writeInt(jArr.length);
                            while (i < jArr.length) {
                                dataOutputStream.writeLong(jArr[i]);
                                i++;
                            }
                        } else if (value instanceof Integer) {
                            dataOutputStream.writeByte(5);
                            dataOutputStream.writeInt(((Integer) value).intValue());
                        } else if (value instanceof int[]) {
                            dataOutputStream.writeByte(6);
                            int[] iArr = (int[]) value;
                            dataOutputStream.writeInt(iArr.length);
                            while (i < iArr.length) {
                                dataOutputStream.writeInt(iArr[i]);
                                i++;
                            }
                        } else if (value instanceof Boolean) {
                            dataOutputStream.writeByte(7);
                            dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
                        } else if (value instanceof boolean[]) {
                            dataOutputStream.writeByte(8);
                            boolean[] zArr = (boolean[]) value;
                            dataOutputStream.writeInt(zArr.length);
                            while (i < zArr.length) {
                                dataOutputStream.writeBoolean(zArr[i]);
                                i++;
                            }
                        } else if (value instanceof Byte) {
                            dataOutputStream.writeByte(9);
                            dataOutputStream.writeByte(((Byte) value).byteValue());
                        } else if (value instanceof byte[]) {
                            dataOutputStream.writeByte(10);
                            byte[] bArr = (byte[]) value;
                            dataOutputStream.writeInt(bArr.length);
                            dataOutputStream.write(bArr);
                        } else if (value instanceof Double) {
                            dataOutputStream.writeByte(11);
                            dataOutputStream.writeDouble(((Double) value).doubleValue());
                        }
                    }
                }
                dataOutputStream.flush();
                byteArrayOutputStream.flush();
                byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return byteArray;
    }

    @Override // defpackage.aamb
    public final void h(String str, boolean z) {
        Map map = this.a;
        synchronized (map) {
            map.put(str, Boolean.valueOf(z));
        }
    }

    @Override // defpackage.aamb
    public final void i(String str, byte[] bArr) {
        Map map = this.a;
        synchronized (map) {
            map.put(str, bArr);
        }
    }

    @Override // defpackage.aamb
    public final void j(String str, int i) {
        Map map = this.a;
        synchronized (map) {
            map.put(str, Integer.valueOf(i));
        }
    }

    @Override // defpackage.aamb
    public final void k(String str, long j) {
        Map map = this.a;
        synchronized (map) {
            map.put(str, Long.valueOf(j));
        }
    }

    @Override // defpackage.aamb
    public final void l(String str, String str2) {
        Map map = this.a;
        synchronized (map) {
            map.put(str, str2);
        }
    }

    @Override // defpackage.aamb
    public final boolean m(String str, boolean z) {
        Map map = this.a;
        return map.containsKey(str) ? ((Boolean) map.get(str)).booleanValue() : z;
    }

    @Override // defpackage.aamb
    public final byte[] n(String str) {
        Map map = this.a;
        if (map.containsKey(str)) {
            return (byte[]) map.get(str);
        }
        return null;
    }

    @Override // defpackage.aamb
    public final boolean o() {
        return m("sd_card_offline_disk_error", false);
    }

    @Override // defpackage.aamb
    public final String p() {
        return ahno.Z(e("transfer_nonce", ""));
    }

    @Override // defpackage.aamb
    public final void q(double d) {
        Map map = this.a;
        synchronized (map) {
            map.put("bytes_per_sec", Double.valueOf(d));
        }
    }

    public aamv() {
        this.a = new HashMap();
    }
}
