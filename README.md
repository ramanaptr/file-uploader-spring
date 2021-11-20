# file-uploader-spring

## Rest API Example
 POST: http://localhost/file/upload
### request param for form-data:
   #### - file: (Selected File)
   #### - path: (Your-path-store)
  
 POST: http://localhost/file/delete
### request param for form-data:
   #### - path: (Your-path-store)
  
 ## Breakdown rest API params
     * 'file' for select your file from your devices (MultipartFile Object)
     * 'path' for your path where you want to store/save, example: /Users/ramana/Desktop/
