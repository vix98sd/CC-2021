from django.db import models

# Create your models here.


class Student(models.Model):
    first_name = models.CharField(null=False, max_length=512)
    last_name = models.CharField(null=False, max_length=512)
    email = models.CharField(null=False, max_length=512)
    year = models.IntegerField(null=False)
    # dob = models.DateField()