node('jnlp') {
   stage('maven'){
       sh 'll'
       sh 'mvn clean package dockerfile:build'
   }
   stage('jdk'){
       sh 'java -version'
   }
  stage('docker'){
      sh 'docker version'
  }
   stage('kubectl'){
        withKubeConfig(caCertificate: '''-----BEGIN CERTIFICATE-----
            MIIDWjCCAkKgAwIBAgIIO9YSUJFbFsQwDQYJKoZIhvcNAQELBQAwFTETMBEGA1UE
            AxMKa3ViZXJuZXRlczAeFw0xOTAxMTkxNzMxNTBaFw0yMDAxMTkxNzMxNTBaMBkx
            FzAVBgNVBAMTDmt1YmUtYXBpc2VydmVyMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A
            MIIBCgKCAQEAvDUUzLPJsVN2BH7eO8vZalcuG6NlWVWwL/qraysWC8u9mm/ZNcat
            KoFs91P3LjRoj5FVi9IJeFqoW5WC0w9/hu2eyZeWuJXm5pEZZk0OHWKzXQEDBz6x
            DVkXQDlcbxLpRqrkVueeXxVArkpp1YoCG6GLOt2z2JaFxVPvC4pR5n10LOE4GC46
            C3a1WWuc1MlpIgBw4Fu7AYhUbv0qlTw/vAVUP1/0Wd4CAqDa9Qk6+foJrtEEc1Pz
            rDz4+wyPSVJItBEm6cc1Wt4xl8/yXiBza2XfK+xfP/SoG1kondQoJQmUWT6XC8T4
            fuSRzzP5rUoZ/v40f6DPspqwTwaEksgswQIDAQABo4GpMIGmMA4GA1UdDwEB/wQE
            AwIFoDATBgNVHSUEDDAKBggrBgEFBQcDATB/BgNVHREEeDB2ggprOHMtbWFzdGVy
            ggprdWJlcm5ldGVzghJrdWJlcm5ldGVzLmRlZmF1bHSCFmt1YmVybmV0ZXMuZGVm
            YXVsdC5zdmOCJGt1YmVybmV0ZXMuZGVmYXVsdC5zdmMuY2x1c3Rlci5sb2NhbIcE
            CmAAAYcEwKgDAzANBgkqhkiG9w0BAQsFAAOCAQEAI0bwkXj5J36v2j1/UQazMaz9
            33rcXd0t8qblRZszCZVP53/pk9XIoGUqyqYszwj38882Jc4k35N2sWZ3IT0XZxfr
            2xY+XgWgJGfS2QAsSIzPMDJNtXDmlrwX+m6OCaLdV4+ibLxiccre2XubgeRNGxiN
            o4/nWbsgLgk7jF0U2YXIm5EMC5IeG/LnXQWz8NSudFc3V0Soo7eTFiBOxui9T4vd
            g8BCRw84JLy/jFtQ+jRaUCjcYP7HBACOHxBCwmPkyBHnbFFc8j6q8bOSj7nEf2G+
            skPUVZJhW2mDGF1kaaGfEFu0Uvkf7664sxZ3jU+2PN0mPDATZ18lTQdr4hTYWQ==
            -----END CERTIFICATE-----''', clusterName: 'kubernetes', contextName: 'kube-system', credentialsId: 'k8s', serverUrl: 'https://192.168.3.3:6443') {
                sh 'kubectl get nodes --insecure-skip-tls-verify=true'
            }
   }
}